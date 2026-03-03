package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun SelectableText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        SelectionContainer {
            Column {
                Text("Selection Text", style = TextStyle(color = Color.Black, fontSize = 30.sp))
                Text(
                    "I am learning Jetpack Compose",
                    style = TextStyle(color = Color.Blue, fontSize = 30.sp)
                )
                Text(
                    "Native Android Developers",
                    style = TextStyle(color = Color.Green, fontSize = 30.sp)
                )
                DisableSelection {
                    Text(
                        "Disable Selection Text",
                        style = TextStyle(color = Color.Red, fontSize = 30.sp)
                    )
                }
            }
        }
    }
}