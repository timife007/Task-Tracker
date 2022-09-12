package com.timife.tasktracker.feature_task.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timife.tasktracker.feature_task.data.model.TaskEntity

@Database(
    entities = [TaskEntity::class],
    version = 1,
    exportSchema = true
)
abstract class TaskDatabase :RoomDatabase(){
    abstract fun taskDao(): TaskDao
}