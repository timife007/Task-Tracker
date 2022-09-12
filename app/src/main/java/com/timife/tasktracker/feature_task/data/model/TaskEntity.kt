package com.timife.tasktracker.feature_task.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.IDN

@Entity(tableName = "taskTrackerEntity")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val title:String,
    val isChecked:Boolean,
    val date:String,
    val fromTime:String,
    val toTime:String,
    val day:String,
    val isAllDay:Boolean
)