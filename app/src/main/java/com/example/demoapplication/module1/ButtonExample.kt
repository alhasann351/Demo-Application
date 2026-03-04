package com.example.demoapplication.module1

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun FilledButtonExample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column() {
            Button(onClick = {
                Toast.makeText(context, "Filled Button is clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Click Me")
            }
            FilledTonalButton(onClick = {
                Toast.makeText(context, "Tonal Button is clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Tonal Button")
            }
        }
    }
}