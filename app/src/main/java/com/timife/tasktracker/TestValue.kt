package com.timife.tasktracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.feature_task.domain.model.TaskItem
import com.timife.tasktracker.ui.theme.Gray

var taskTestList = mutableListOf(TaskItem(1,"Contact the CEO of Decagon",true,"14th February","18:00","00:00","Monday",true),
    TaskItem(2,"Design the on-boarding session of task tracker app",false,"14th February","18:00","00:00","Tuesday",true),
    TaskItem(3,"Remind the technical team to include the micro-interactions delivered",true,"14th February","18:00","00:00","Wednesday",true),
    )

@Composable
fun TestApp(){
    BasicTextField(value = "", onValueChange ={}, modifier = Modifier.fillMaxWidth().height(100.dp).background(
        Gray) )
}

@Preview
@Composable
fun Prevs(){
    androidx.compose.material.Surface(modifier = Modifier.padding(10.dp)) {
        TestApp()
    }
}
