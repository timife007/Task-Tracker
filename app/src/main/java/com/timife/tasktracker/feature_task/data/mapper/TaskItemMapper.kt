package com.timife.tasktracker.feature_task.data.mapper

import com.timife.tasktracker.feature_task.data.model.TaskEntity
import com.timife.tasktracker.feature_task.domain.model.TaskItem

fun TaskEntity.toTaskItem(): TaskItem {
    return TaskItem(
        id = id,
        title = title,
        isChecked = isChecked,
        date = date,
        fromTime = fromTime,
        toTime = toTime,
        day = day,
        isAllDay = isAllDay
    )
}

fun TaskItem.toTaskEntity(): TaskEntity {
    return TaskEntity(
        id = id ?: 0,
        title = title ?: "Null Item",
        isChecked = isChecked ?: false,
        date = date ?: "24th May",
        fromTime = fromTime ?: "18:00",
        toTime = toTime ?: "23:00",
        day = day ?: "Monday",
        isAllDay = isAllDay ?: true
    )
}