package com.timife.tasktracker.feature_task.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String?, val icon: ImageVector?) {
    object Home : Screen("home", "Home", Icons.Outlined.Home)
    object Search : Screen("search", "Search", Icons.Outlined.Search)
    object Notifications:Screen("notifications","Notifications",Icons.Outlined.Notifications)
    object Settings:Screen("settings","Settings",Icons.Outlined.Settings)

}