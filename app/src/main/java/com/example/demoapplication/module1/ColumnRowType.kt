package com.example.demoapplication.module1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {
    Column() {
        Text("Lazy Column")

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Green)
        ) {
            items(100) { index ->
                Text(
                    "Item $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(color = Color.Red)
                )
            }
        }
    }
}

@Composable
fun LazyRowExample() {
    Column() {
        Text("Lazy Column")

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Green)
        ) {
            items(100) { index ->
                Text(
                    "Item ${index + 1}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(color = Color.Red)
                )
            }
        }
    }
}