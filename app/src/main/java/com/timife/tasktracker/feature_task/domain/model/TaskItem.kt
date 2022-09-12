package com.timife.tasktracker.feature_task.domain.model

data class TaskItem(
    val id:Int? ,
    val title:String?,
    val isChecked:Boolean?,
    val date:String?,
    val fromTime:String?,
    val toTime:String?,
    val day:String?,
    val isAllDay:Boolean?
)