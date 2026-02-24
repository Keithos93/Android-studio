package com.example.taskapp.screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutapp.ui.theme.Pink80

@Preview
@Composable
fun MySecondBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        // 9 Box
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Red)
                .align(Alignment.Center)

        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Blue)
                .align(Alignment.CenterStart)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Magenta)
                .align(Alignment.CenterEnd)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Green)
                .align(Alignment.TopStart)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Yellow)
                .align(Alignment.TopCenter)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Cyan)
                .align(Alignment.TopEnd)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.White)
                .align(Alignment.BottomStart)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Gray)
                .align(Alignment.BottomCenter)
        )
        Box (
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(color = Pink80)
                .align(Alignment.BottomEnd)
        )
    }
}