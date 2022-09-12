package com.timife.tasktracker.feature_task.data.data_source

import androidx.room.*
import com.timife.tasktracker.feature_task.data.model.TaskEntity

@Dao
interface TaskDao {

    @Query("SELECT * FROM taskTrackerEntity")
    suspend fun getAllTasks(): List<TaskEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(taskItem: TaskEntity)

    @Query("DELETE FROM taskTrackerEntity WHERE id = :taskId")
    suspend fun deleteTask(taskId:Int)

    @Update
    suspend fun updateTask(taskItem: TaskEntity)
}
