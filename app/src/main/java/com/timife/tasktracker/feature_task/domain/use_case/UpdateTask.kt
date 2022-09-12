package com.timife.tasktracker.feature_task.domain.use_case

import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.feature_task.domain.repository.TaskRepository
import javax.inject.Inject

class UpdateTask @Inject constructor(
    private val taskRepository: TaskRepository
){
    suspend operator fun invoke(taskItem: TaskItem){
        taskRepository.updateTaskItem(taskItem)
    }

}