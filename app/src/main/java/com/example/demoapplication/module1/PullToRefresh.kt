package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun PullToRefresh() {
    var isRefreshing by remember { mutableStateOf(false) }
    var items by remember { mutableStateOf(List(10) { index -> "Item ${index + 1}" }) }

    fun refresh() {
        isRefreshing = true
    }

    LaunchedEffect(isRefreshing) {
        if (isRefreshing) {
            delay(2000)
            items = List(10) { index ->
                "Refreshed Item ${index + 1}"
            }
            isRefreshing = false
        }
    }

    PullToRefreshBox(isRefreshing = isRefreshing, onRefresh = { refresh() }) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            items(items) { item ->
                Text(
                    text = item,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}