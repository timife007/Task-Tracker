package com.timife.tasktracker.feature_task.presentation.add_edit_tasks.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.ui.theme.NavyBlue

@Composable
fun EditTimeDateRow(){
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.Outlined.AccessTime, contentDescription = "")
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "July 25, 2022", color = NavyBlue)
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "12:00 AM", color = NavyBlue)
        }
        Spacer(modifier = Modifier.weight(1f))
        Checkbox(checked = false, onCheckedChange = {})
        Text(text = "All day", color = NavyBlue)


    }
}

//@Preview
//@Composable
//fun Preview(){
//   Surface(
//       modifier = Modifier.padding(10.dp)
//   ) {
//       EditTimeDateRow()
//   }
//}
