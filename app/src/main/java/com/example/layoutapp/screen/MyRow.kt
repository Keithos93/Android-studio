package com.example.layoutapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.layoutapp.ui.theme.PurpleGrey40

@Composable
fun MyRow(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Enfants(s)
        Text(
            text = "A",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "B",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "C",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "D",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
    }
}