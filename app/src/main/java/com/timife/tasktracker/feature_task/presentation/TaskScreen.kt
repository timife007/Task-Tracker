package com.timife.tasktracker.feature_task.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.EditCalendar
import androidx.compose.material.icons.filled.Sort
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.timife.tasktracker.R
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components.EditTaskRow
import com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components.EditTimeDateRow
import com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components.EditTimerRow
import com.timife.tasktracker.feature_task.presentation.navigation.BottomNav
import com.timife.tasktracker.feature_task.presentation.tasks.components.TaskListItem
import com.timife.tasktracker.taskTestList
import com.timife.tasktracker.ui.theme.Green
import com.timife.tasktracker.ui.theme.LightGreen
import com.timife.tasktracker.ui.theme.Shapes
import com.timife.tasktracker.ui.theme.Typography
import kotlinx.coroutines.flow.collectLatest

@Composable
fun TaskScreen(
    modifier: Modifier,
    viewModel: TaskViewModel = hiltViewModel(),
    navController: NavController,
    scaffoldState: ScaffoldState
    ) {
    val listState = viewModel.listState
    val editState = viewModel.editTaskState

    LaunchedEffect(key1 = true){
        viewModel.eventFlow.collectLatest { event ->
            when(event){
                is TaskViewModel.UiEvent.ShowSnackbar ->{
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message
                    )
                }
                is TaskViewModel.UiEvent.SaveTask ->{

                }
            }

        }
    }

    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) {
        LazyColumn(
            modifier = modifier.padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            item {
                Column(
                    modifier = modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = modifier,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Title:", modifier = Modifier.weight(1f), style = Typography.h6)
                        IconButton(onClick = {
                            viewModel.onEvent(TaskEvent.SaveTask)
                        }) {
                            Icon(
                                imageVector = Icons.Default.EditCalendar,
                                contentDescription = stringResource(R.string.calender_icon)
                            )
                        }
                        IconButton(onClick = {
                            //TO DO
                        }) {
                            Icon(
                                imageVector = Icons.Outlined.Edit,
                                contentDescription = stringResource(id = R.string.edit)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    BasicTextField(
                        value = editState.value.titleText,
                        onValueChange = {
                                        viewModel.onEvent(TaskEvent.EnterTitle(it))
                        },
                        modifier = Modifier
                            .clip(Shapes.large)
                            .height(100.dp)
                            .fillMaxSize()
                            .background(
                                LightGreen
                            )
                            .padding(10.dp), enabled = true, maxLines = 3, singleLine = true)

                    Spacer(modifier = Modifier.height(8.dp))
                    EditTaskRow()
                    Spacer(modifier = Modifier.height(8.dp))
                    EditTimeDateRow()
                    Spacer(modifier = Modifier.height(8.dp))
                    EditTimerRow()
                    Spacer(modifier = Modifier.height(35.dp))
                }
            }
            item {
                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Tasks Created",
                        style = Typography.h6,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Sort,
                            contentDescription = stringResource(R.string.sort)
                        )
                    }
                }
            }
            items(listState.value.taskList ) { taskItem ->
                TaskListItem(
                    modifier = modifier.background(Color.LightGray),
                    onCheckChange = { checked ->
                    },
                    taskItem = taskItem,
                    onEditClick = {

                    },
                    onDeleteClick = {
                        viewModel.onEvent(TaskEvent.DeleteTask(taskItem.id!!))
                    }
                )
            }
        }
    }
}
