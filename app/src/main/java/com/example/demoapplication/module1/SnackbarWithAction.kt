package com.example.demoapplication.module1

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun SnackBarAction() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var message by remember { mutableStateOf("Nothing yet") }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "Item deleted",
                            actionLabel = "Undo",
                            duration = SnackbarDuration.Long
                        )
                        when (result) {
                            SnackbarResult.ActionPerformed -> {
                                message = "Undo clicked"
                            }

                            SnackbarResult.Dismissed -> {
                                message = "Snackbar dismissed"
                            }
                        }
                    }
                }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Show Snackbar")
            }
        }
    ) { paddingValues ->
        Text(message, modifier = Modifier
            .padding(paddingValues)
            .padding(16.dp))
    }
}