package com.example.demoapplication.module1

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demoapplication.R

@Composable
fun ImageExample() {
    val rainbowColor = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFFFF0000),
                Color(0xFFFF7F00),
                Color(0xFFFFFF00),
                Color(0xFF00FF00),
                Color(0xFF0000FF),
                Color(0xFF4B0082),
                Color(0xFF8F00FF)
            )
        )
    }
    val borderWidth = 4.dp

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(
                id = R.drawable.nature
            ),
            contentDescription = "nature",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .border(BorderStroke(borderWidth, Color.Red)),
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                setToSaturation(2f)
            })

        )
    }
}