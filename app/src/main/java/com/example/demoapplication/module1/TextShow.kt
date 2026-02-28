package com.example.demoapplication.module1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting() {
    Text("Hello Jetpack Compose")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting()
}

