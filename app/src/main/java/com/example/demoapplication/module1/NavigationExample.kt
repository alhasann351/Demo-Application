package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationExe() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(onGotoProfile = {
                navController.navigate("profile")
            }
            )
        }
        composable("profile") {
            ProfileScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}

@Composable
fun HomeScreen(onGotoProfile: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home Screen")
        Button(onClick = onGotoProfile) {
            Text("Go to Profile")
        }
    }
}

@Composable
fun ProfileScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profile Screen")
        Button(onClick = onBack) {
            Text("Back to Home")
        }
    }
}