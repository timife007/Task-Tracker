package com.timife.tasktracker.feature_task.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timife.tasktracker.ui.theme.Green
import com.timife.tasktracker.ui.theme.Typography

@Composable
fun TopAppBar(
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(10.dp)
    ) {
        Spacer(modifier = Modifier.weight(0.6f))
        Text(text = "Task Tracker", style = Typography.h6, modifier = Modifier.weight(1f))
        IconButton(
            onClick = { /*TODO*/ }, modifier = Modifier
                .clip(CircleShape.copy(CornerSize(100)))
                .background(Green)
        ) {
            Icon(imageVector = Icons.Outlined.PersonOutline, contentDescription = "Profile")
        }
    }
}

@Preview
@Composable
fun AppBarPrev() {
    Surface(modifier = Modifier.padding(10.dp)) {
        TopAppBar()
    }
}
