package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SliderExp() {
    var sliderPosition by remember { mutableFloatStateOf(50f) }
    var value by remember { mutableFloatStateOf(0.3f) }
    var rangeSliderPosition by remember { mutableStateOf(20f..80f) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Value: ${sliderPosition.toInt()}", style = MaterialTheme.typography.bodyLarge)
            Slider(
                value = sliderPosition,
                onValueChange = { sliderPosition = it },
                valueRange = 0f..100f,
                steps = 9,
                modifier = Modifier.fillMaxWidth()
            )
            Text("Progress: ${(value * 100).toInt()}%")
            Slider(
                value = value,
                onValueChange = { value = it },
                valueRange = 0f..100f,
                modifier = Modifier.fillMaxWidth()
            )
            Text("Start: ${rangeSliderPosition.start.toInt()}")
            Text("End: ${rangeSliderPosition.endInclusive.toInt()}")
            RangeSlider(
                value = rangeSliderPosition,
                onValueChange = { rangeSliderPosition = it },
                valueRange = 10f..100f,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

}