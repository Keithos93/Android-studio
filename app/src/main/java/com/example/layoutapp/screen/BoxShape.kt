package com.example.layoutapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutapp.ui.theme.Pink80

@Preview
@Composable
fun BoxShape(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFD0BCFF),
                        Color(0xffa8556d),
                        Color(0xff24af2e),
                        Color(0xff44ad93),
                        Color(0xffdfc30f),

                    )
                )
            )
    ) {
//        Box(
//            modifier = Modifier
//                .size(200.dp)
//                .background(
//                    color = Color
//                )
//        )
    }
}