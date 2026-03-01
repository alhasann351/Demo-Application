package com.example.demoapplication.module1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.demoapplication.R

@Composable
fun ResourceShow() {
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        //Text(text = stringResource(R.string.app_name),  color = colorResource(R.color.teal_200))
        Image(painter = painterResource(R.drawable.nature), contentDescription = "nature")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ResourceShowPreview() {
    ResourceShow()
}