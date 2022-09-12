package com.timife.tasktracker.di

import android.app.Application
import androidx.room.Room
import com.timife.tasktracker.feature_task.data.data_source.TaskDao
import com.timife.tasktracker.feature_task.data.data_source.TaskDatabase
import com.timife.tasktracker.feature_task.domain.repository.TaskRepository
import com.timife.tasktracker.feature_task.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideTaskDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            "tasks.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskDao(
        taskDatabase: TaskDatabase
    ): TaskDao {
        return taskDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideTaskUseCases(repository: TaskRepository): TaskUseCases {
        return TaskUseCases(
            getTasks = GetTasks(repository),
            deleteTask = DeleteTask(repository),
            saveTask = SaveTask(repository),
            updateTask = UpdateTask(repository)
        )
    }
}