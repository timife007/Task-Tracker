package com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.SubdirectoryArrowLeft
import androidx.compose.material.icons.filled.SubdirectoryArrowRight
import androidx.compose.material.icons.outlined.Archive
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.R
import com.timife.tasktracker.ui.theme.LightGreen
import com.timife.tasktracker.ui.theme.Shapes

@Composable
fun EditTaskRow(

) {
    Row(
        modifier = Modifier
            .clip(Shapes.large)
            .background(LightGreen)
            .height(46.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.Image,
                contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.Notifications, contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.Palette, contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
            Icon(
                imageVector = Icons.Outlined.Archive, contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.SubdirectoryArrowLeft,
                contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
            Icon(
                imageVector = Icons.Default.SubdirectoryArrowRight,
                contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
        IconButton(onClick = { /*TODO*/ },modifier = Modifier) {
            Icon(
                imageVector = Icons.Default.MoreVert, contentDescription = stringResource(
                    id = R.string.edit
                )
            )
        }
    }
}

//@Preview
//@Composable
//fun EditPrev(){
//    EditTaskRow()
//
//}