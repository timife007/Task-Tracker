package com.timife.tasktracker.feature_task.data.repository

import com.timife.tasktracker.feature_task.data.data_source.TaskDao
import com.timife.tasktracker.feature_task.data.mapper.toTaskEntity
import com.timife.tasktracker.feature_task.data.mapper.toTaskItem
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.feature_task.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao
): TaskRepository {
    override fun getAllTasks(): Flow<List<TaskItem>> {
        return flow {
            taskDao.getAllTasks().map {
                it.toTaskItem()
            }
        }
    }

    override suspend fun insertTaskItem(taskItem: TaskItem) {
        taskDao.insertTask(taskItem.toTaskEntity())
    }

    override suspend fun deleteTaskItem(taskId: Int) {
        taskDao.deleteTask(taskId)
    }

    override suspend fun updateTaskItem(taskItem: TaskItem) {
        taskDao.updateTask(taskItem.toTaskEntity())
    }


}