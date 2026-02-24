package com.example.layoutapp.screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutapp.component.TemplateColumnItem
import com.example.layoutapp.ui.theme.PurpleGrey40

@Preview( showBackground = true, showSystemUi = true)
@Composable

fun MyLazyColumn(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40),
        contentPadding = PaddingValues(all = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(count = 30){
            TemplateColumnItem()
        }
    }
}