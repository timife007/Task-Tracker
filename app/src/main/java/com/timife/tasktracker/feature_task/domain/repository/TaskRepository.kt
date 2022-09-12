package com.timife.tasktracker.feature_task.domain.repository

import com.timife.tasktracker.feature_task.domain.model.TaskItem
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    fun getAllTasks():Flow<List<TaskItem>>

    suspend fun insertTaskItem(taskItem: TaskItem)

    suspend fun deleteTaskItem(taskId:Int)

    suspend fun updateTaskItem(taskItem: TaskItem)

}