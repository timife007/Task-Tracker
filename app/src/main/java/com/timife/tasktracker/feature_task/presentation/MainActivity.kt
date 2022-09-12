package com.timife.tasktracker.feature_task.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timife.tasktracker.TestApp
import com.timife.tasktracker.feature_task.presentation.navigation.BottomNav
import com.timife.tasktracker.feature_task.presentation.navigation.MainNavigation
import com.timife.tasktracker.feature_task.presentation.navigation.Screen
import com.timife.tasktracker.feature_task.presentation.notifications.NotificationScreen
import com.timife.tasktracker.feature_task.presentation.search_tasks.SearchScreen
import com.timife.tasktracker.feature_task.presentation.settings.Settings
import com.timife.tasktracker.ui.theme.Green
import com.timife.tasktracker.ui.theme.TaskTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    val scaffoldState = rememberScaffoldState()
                    Scaffold(
                        bottomBar = {
                            BottomAppBar(
                                modifier = Modifier
                                    .height(60.dp)
                                ,
                                cutoutShape = CircleShape,
                                elevation = 20.dp,
                                backgroundColor = Color.White
                            ) {
                                BottomNav(navController = navController)

                            }

                        },
                        isFloatingActionButtonDocked = true,
                        floatingActionButtonPosition = FabPosition.Center,
                        floatingActionButton = {
                            FloatingActionButton(
                                modifier = Modifier,
                                onClick = {
                                },
                                backgroundColor = Green,
                                contentColor = Color.White
                            ) {
                                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Task")
                            }
                        },
                        scaffoldState = scaffoldState
                    ) {

                        MainNavigation(navController = navController, scaffoldState = scaffoldState)
                    }

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}