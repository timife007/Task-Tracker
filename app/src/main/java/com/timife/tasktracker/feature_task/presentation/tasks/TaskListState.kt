package com.timife.tasktracker.feature_task.presentation.tasks

import com.timife.tasktracker.feature_task.domain.model.TaskItem

data class TaskListState(
    val taskList:List<TaskItem> = emptyList()
)