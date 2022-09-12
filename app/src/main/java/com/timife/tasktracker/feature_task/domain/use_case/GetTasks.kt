package com.timife.tasktracker.feature_task.domain.use_case

import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.feature_task.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetTasks @Inject constructor(
    private val taskRepository: TaskRepository
){

    operator fun invoke(): Flow<List<TaskItem>>{
        return taskRepository.getAllTasks()
    }

}