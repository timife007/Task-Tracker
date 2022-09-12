package com.timife.tasktracker.feature_task.domain.use_case

data class TaskUseCases(
    val getTasks:GetTasks,
    val saveTask:SaveTask,
    val deleteTask: DeleteTask,
    val updateTask: UpdateTask
)
