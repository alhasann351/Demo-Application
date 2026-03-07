package com.example.demoapplication.module1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.demoapplication.R

@Composable
fun DialogWithImage(
) {
    val context = LocalContext.current

    Dialog(
        onDismissRequest = {
        }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Image(
                painter = painterResource(
                    R.drawable.nature
                ),
                contentDescription = "nature",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Text("This is Dialog", modifier = Modifier.padding(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(
                    onClick = {
                        Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Cancel")
                }
                TextButton(
                    onClick = {
                        Toast.makeText(context, "Confirm", Toast.LENGTH_SHORT).show()
                    }, modifier = Modifier.padding(10.dp)
                ) {
                    Text("Confirm")
                }
            }

        }
    }
}