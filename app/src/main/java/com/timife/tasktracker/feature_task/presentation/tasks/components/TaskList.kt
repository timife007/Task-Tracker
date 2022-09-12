package com.timife.tasktracker.feature_task.presentation.tasks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Sort
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.R
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.taskTestList
import com.timife.tasktracker.ui.theme.Typography

@Composable
fun TaskList(
    modifier: Modifier,
    taskItems: List<TaskItem>,
    onCheckChange: (TaskItem,Boolean) -> Unit,
    onEditClick: (TaskItem) -> Unit,
    onDeleteClick: (TaskItem) -> Unit
) {
    LazyColumn(

    ) {
        

    }
}
