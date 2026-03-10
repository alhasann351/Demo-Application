package com.example.demoapplication.module1

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var presses by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text("Top Appbar")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
                tonalElevation = 6.dp
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
                        modifier = Modifier.clickable {},
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Home, contentDescription = "Favorite")
                        }
                        Text("Home")
                    }
                    Column(
                        modifier = Modifier.clickable {},
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Alarm, contentDescription = "Alarm")
                        }
                        Text("Alarm")
                    }
                    Column(
                        modifier = Modifier.clickable {},
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
                        }
                        Text("Favorite")
                    }
                    Column(
                        modifier = Modifier.clickable {},
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Person, contentDescription = "Person")
                        }
                        Text("Person")
                    }
                }

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Text(presses.toString())
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Text(
                "Hello! Jetpack Compose",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}