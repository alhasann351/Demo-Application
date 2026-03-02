package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.demoapplication.R

@Composable
fun SimpleText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(R.string.app_name),
            color = Color.Red,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            style = TextStyle(
                shadow = Shadow(color = Color.Blue, blurRadius = 10f)
            )
        )
    }
}

@Composable
fun ColorFullText() {
    val rainbowColor = listOf(
        Color(0xFFFF0000),
        Color(0xFFFF7F00),
        Color(0xFFFFFF00),
        Color(0xFF00FF00),
        Color(0xFF0000FF),
        Color(0xFF4B0082),
        Color(0xFF8F00FF)
    )

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(buildAnnotatedString {
            append("Hello Jetpack Compose \n")
            withStyle(
                style = SpanStyle(brush = Brush.linearGradient(rainbowColor))
            ) {
                append("Native Android Developers")
            }
            append("\nI am learning Jetpack Compose")
        })
    }
}