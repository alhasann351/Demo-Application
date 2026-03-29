package com.example.demoapplication.module1

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

sealed class BottomNavItem(
    val route: String,
    val label: String
) {
    data object Home : BottomNavItem("home", "Home")
    data object Profile : BottomNavItem("profile", "Profile")
    data object Settings : BottomNavItem("settings", "Settings")
}

@Composable
fun BottomNavbarExe() {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Profile,
        BottomNavItem.Settings
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                items.forEach { item ->
                    val selected = currentDestination?.hierarchy?.any {
                        it.route == item.route
                    } == true

                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            when (item) {
                                BottomNavItem.Home -> Icon(
                                    Icons.Default.Home,
                                    contentDescription = item.label
                                )

                                BottomNavItem.Profile -> Icon(
                                    Icons.Default.Person,
                                    contentDescription = item.label
                                )

                                BottomNavItem.Settings -> Icon(
                                    Icons.Default.Settings,
                                    contentDescription = item.label
                                )
                            }
                        },
                        label = { Text(item.label) }
                    )

                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Home.route) {
                Text("Home Screen")
            }
            composable(BottomNavItem.Profile.route) {
                Text("Profile Screen")
            }
            composable(BottomNavItem.Settings.route) {
                Text("Settings Screen")
            }
        }
    }

}