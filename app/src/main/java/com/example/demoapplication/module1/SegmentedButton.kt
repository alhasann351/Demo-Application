package com.example.demoapplication.module1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SegmentedButtonExp() {
    val selectedOptions = remember {
        mutableStateListOf(false, false, false)
    }
    val options = listOf("Favorite", "Person", "Lock")

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        MultiChoiceSegmentedButtonRow {
            options.forEachIndexed { index, label ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(index = index, count = options.size),
                    checked = selectedOptions[index],
                    onCheckedChange = {
                        selectedOptions[index] = !selectedOptions[index]
                    },
                    icon = {
                        SegmentedButtonDefaults.Icon(selectedOptions[index])
                    },
                    label = {
                        when (label) {
                            "Favorite" -> Icon(
                                Icons.Default.Favorite,
                                contentDescription = "Favorite"
                            )

                            "Person" -> Icon(Icons.Default.Person, contentDescription = "Person")
                            "Lock" -> Icon(Icons.Default.Lock, contentDescription = "Lock")
                        }
                    }
                )
            }
        }
    }
}