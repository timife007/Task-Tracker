package com.timife.tasktracker.feature_task.presentation.add_edit_tasks


data class TaskEditState(
    val titleText: String = "",
    val titleHint: String = "",
    val isHintVisible: Boolean = true,
    val time: String = "",
    val date:String = "",
    val fromTime: String  = "",
    val toTime:String = "",
    val isAllDay:Boolean = false,
    val isChecked:Boolean = false
)