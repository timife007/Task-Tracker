package com.timife.tasktracker.feature_task.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.feature_task.domain.use_case.TaskUseCases
import com.timife.tasktracker.feature_task.presentation.add_edit_tasks.TaskEditState
import com.timife.tasktracker.feature_task.presentation.tasks.TaskListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import java.io.InvalidClassException
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val useCases: TaskUseCases
) : ViewModel() {

    private val _listState = mutableStateOf(TaskListState())
    val listState: State<TaskListState> = _listState

    private val _editTaskState = mutableStateOf(
        TaskEditState(
            titleHint = "Enter title..."))
    val editTaskState: State<TaskEditState> = _editTaskState

    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    private var currentTaskId: Int? = null

    init {
        getTasks()
    }

    private fun editTask() {
        TODO("Not yet implemented")
    }

    private fun getTasks() {
        viewModelScope.launch {
            useCases.getTasks().onEach { tasks ->
                _listState.value = listState.value.copy(taskList = tasks)
            }
        }
    }


    fun onEvent(event: TaskEvent) {
        when (event) {
            is TaskEvent.EnterTitle -> {
                _editTaskState.value = editTaskState.value.copy(
                    titleText = event.title
                )
            }
            is TaskEvent.EnterDate -> {
                _editTaskState.value = editTaskState.value.copy(
                    date = event.date
                )

            }
            is TaskEvent.EnterTime -> {
                _editTaskState.value = editTaskState.value.copy(
                    time = event.time
                )
            }
            is TaskEvent.SaveTask -> {
                viewModelScope.launch {
                    try {
                        useCases.saveTask(
                            TaskItem(
                                id = currentTaskId,
                                title = editTaskState.value.titleText,
                                isChecked = editTaskState.value.isChecked,
                                date = editTaskState.value.date,
                                fromTime = editTaskState.value.fromTime,
                                toTime = editTaskState.value.toTime,
                                day = editTaskState.value.date,
                                isAllDay = editTaskState.value.isAllDay
                            )
                        )
                    } catch (e: InvalidClassException) {
                        _eventFlow.emit(
                            UiEvent.ShowSnackbar(
                                message = e.message ?: "Couldn't save task"
                            )
                        )
                    }

                }

            }
            is TaskEvent.ClockStartTime -> {
                _editTaskState.value = editTaskState.value.copy(
                    fromTime = event.startTime
                )

            }
            is TaskEvent.ClockEndTime -> {
                _editTaskState.value = editTaskState.value.copy(
                    toTime = event.endTime
                )

            }
            is TaskEvent.CheckAllDay -> {
                _editTaskState.value = editTaskState.value.copy(
                    isAllDay = event.isAllDay
                )

            }
            is TaskEvent.EditItem -> {


            }
            is TaskEvent.DeleteTask ->{
                viewModelScope.launch {
                    useCases.deleteTask(event.taskId)
                }
            }


        }

    }


    sealed class UiEvent {
        data class ShowSnackbar(val message: String) : UiEvent()
        object SaveTask : UiEvent()
    }


}