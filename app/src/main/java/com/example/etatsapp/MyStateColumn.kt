package com.example.etatsapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.etatsapp.ui.theme.Orange

@Preview
@Composable
fun MyStateColumn(){
    Column(
        modifier = Modifier.fillMaxSize().background(color = Orange),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        repeat(times = 200){
            Text(
                "fBonjour le monde $it",
                fontSize = 29.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(all = 5.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.White)
            )
        }
    }
}