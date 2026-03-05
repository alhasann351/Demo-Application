package com.example.demoapplication.module1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(horizontal = 15.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("padding(horizontal = 15.dp, vertical = 10.dp) texrccccc(horizontal = 15.dp, vertical = 10.dp)")
        Text("Text 2")
        Text("Text 3")
        Text("Text 4")
    }
}

@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Text 2")
        Text("Text 3")
        Text("Text 4")
    }
}

@Composable
fun BoxExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
                .background(Color.Green),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .background(Color.Red),
                contentAlignment = Alignment.Center,
            ) {
                Text("Demo")
            }
        }
    }
}

@Composable
fun ConstraintLayoutExample() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Green)
        ) {
            val (text1, text2, text3) = createRefs()
            Text("Bottom Left", modifier = Modifier.constrainAs(text1) {
                bottom.linkTo(parent.bottom, margin = 10.dp)
                start.linkTo(parent.start, margin = 10.dp)
            })
            Text("Center", modifier = Modifier.constrainAs(text2) {
                top.linkTo(parent.top, margin = 10.dp)
                bottom.linkTo(parent.bottom, margin = 10.dp)
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
            })
            Text("Top Right", modifier = Modifier.constrainAs(text3) {
                top.linkTo(parent.top, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
            })
        }
    }

}