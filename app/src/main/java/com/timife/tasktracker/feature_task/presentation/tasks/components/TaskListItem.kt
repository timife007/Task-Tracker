package com.timife.tasktracker.feature_task.presentation.tasks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.R
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.ui.theme.Shapes
import com.timife.tasktracker.ui.theme.Typography

@Composable
fun TaskListItem(
    modifier: Modifier,
    onCheckChange: (Boolean) -> Unit,
    taskItem: TaskItem,
    onEditClick: (TaskItem) -> Unit,
    onDeleteClick: (TaskItem) -> Unit
) {

    Card(
        modifier = Modifier.clip(Shapes.large)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Checkbox(checked = taskItem.isChecked ?: false, onCheckedChange = onCheckChange)
            Text(
                text = taskItem.title ?: "",
                modifier = Modifier.weight(1f).fillMaxWidth(),
                style = Typography.body1,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2
            )
            IconButton(onClick = {
                onEditClick(taskItem)
            }) {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = stringResource(id = R.string.edit)
                )
            }
            IconButton(onClick = {
                onDeleteClick(taskItem)
            }) {
                Icon(
                    imageVector = Icons.Default.DeleteOutline,
                    contentDescription = stringResource(id = R.string.delete)
                )
            }

        }
    }


}

@Preview
@Composable
fun TaskItem() {
    Surface(
        modifier = Modifier
            .background(Color.Transparent)
            .padding(5.dp)
    ) {
        TaskListItem(
            modifier = Modifier.background(color = Color.LightGray),
            onCheckChange = {},
            onDeleteClick = {},
            onEditClick = {},
            taskItem = TaskItem(
                id = 1,
                title = stringResource(R.string.title_test),
                fromTime = "",
                toTime = "",
                date = "",
                day = "",
                isChecked = true,
                isAllDay = true
            )
        )
    }
}