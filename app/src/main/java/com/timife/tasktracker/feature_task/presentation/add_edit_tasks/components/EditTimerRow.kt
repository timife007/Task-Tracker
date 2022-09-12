package com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.ui.theme.NavyBlue
import com.timife.tasktracker.ui.theme.Typography

@Composable
fun EditTimerRow(){
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Icon(imageVector = Icons.Outlined.Timer, contentDescription = "")
        OutlinedButton(onClick = { /*TODO*/ }) {
//            DropdownMenu(true,{}, content = {})
        }
        Text(text = "-", style = Typography.h4)
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "12:00 AM", color = NavyBlue)
//            DropdownMenu(true,{}, content = {})

        }
        Spacer(modifier = Modifier.weight(1f))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "1hr:00:00", color = NavyBlue)
        }

    }
}

//@Preview
//@Composable
//fun EditTimerPreview(){
//    Surface(
//        modifier = Modifier.padding(10.dp)
//    ) {
//        EditTimerRow()
//    }
//}