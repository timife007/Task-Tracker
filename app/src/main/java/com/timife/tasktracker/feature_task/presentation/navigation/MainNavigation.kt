package com.timife.tasktracker.feature_task.presentation.navigation

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.timife.tasktracker.feature_task.presentation.TaskScreen
import com.timife.tasktracker.feature_task.presentation.notifications.NotificationScreen
import com.timife.tasktracker.feature_task.presentation.search_tasks.SearchScreen
import com.timife.tasktracker.feature_task.presentation.settings.Settings

@Composable
fun MainNavigation(navController: NavHostController,scaffoldState:ScaffoldState) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route){
            TaskScreen(
                modifier = Modifier,
                navController = navController,
                scaffoldState = scaffoldState
            )
        }
        composable(Screen.Search.route){
            SearchScreen()
        }
        composable(Screen.Notifications.route){
            NotificationScreen()
        }
        composable(Screen.Settings.route){
            Settings()
        }
    }


}