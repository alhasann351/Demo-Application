package com.example.demoapplication.module1

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
            OutlinedButton(onClick = {
                Toast.makeText(context, "Outline Button clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Outline Button")
            }
            ElevatedButton(onClick = {
                Toast.makeText(context, "Elevated Button clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Elevated Button")
            }
            TextButton(onClick = {
                Toast.makeText(context, "Text Button clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Text Button")
            }
        }
    }
}