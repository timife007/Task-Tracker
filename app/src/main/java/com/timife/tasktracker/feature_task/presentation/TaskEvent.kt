package com.timife.tasktracker.feature_task.presentation

import com.timife.tasktracker.feature_task.domain.model.TaskItem

sealed class TaskEvent {
    data class EnterTitle(val title:String): TaskEvent()
    data class EnterDate(val date:String):TaskEvent()
    data class EnterTime(val time:String): TaskEvent()
    data class CheckAllDay(val isAllDay:Boolean): TaskEvent()
    data class ClockStartTime(val startTime:String):TaskEvent()
    data class ClockEndTime(val endTime:String):TaskEvent()
    data class DeleteTask(val taskId:Int):TaskEvent()
    object SaveTask : TaskEvent()
    object EditItem:TaskEvent()

}