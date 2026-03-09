package com.example.demoapplication.module1

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun MenusExample() {

    var expended by remember() {
        mutableStateOf(false)
    }

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
        Box(modifier = Modifier.padding(16.dp)) {
            IconButton(
                onClick = {
                    expended = !expended
                }
            ) {
                Icon(Icons.Filled.MoreVert, contentDescription = "more")
            }

            DropdownMenu(
                expanded = expended,
                onDismissRequest = {
                    expended = false
                }
            ) {
                DropdownMenuItem(
                    text = { Text("Profile") },
                    trailingIcon = {
                        Icon(Icons.Filled.Person, contentDescription = "person")
                    },
                    onClick = {
                        Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
    }

}