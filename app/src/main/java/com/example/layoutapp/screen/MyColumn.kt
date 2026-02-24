package com.example.layoutapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.layoutapp.ui.theme.LayoutAppTheme
import com.example.layoutapp.ui.theme.PurpleGrey40

@Composable
fun MyColumn(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        // Enfants(s)
        Text(
            text = "Bonjour A",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "Bonjour B",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "Bonjour C",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )
        Text(
            text = "Bonjour D",
            color = Color.White,
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold

        )

    }
}

@Preview
@Composable
fun MyColumnPreview() {
    LayoutAppTheme {
        MyColumn()
    }
}