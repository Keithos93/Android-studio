package com.example.layoutapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutapp.ui.theme.PurpleGrey40
import com.example.layoutapp.component.TemplateColumnItem

@Preview
@Composable
fun MyLazyRow(){
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40),
        contentPadding = PaddingValues(all = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(count = 30){
            TemplateColumnItem()
        }
    }
}