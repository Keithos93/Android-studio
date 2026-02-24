package com.example.layoutapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutapp.component.VerticalItem
import com.example.layoutapp.ui.theme.PurpleGrey40

@Preview
@Composable
fun MyLazyVerticalGrid(modifier: Modifier) {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize()
            .background(color = PurpleGrey40),
        columns = GridCells.Fixed(count = 2),
        contentPadding = PaddingValues(all = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(count = 30){
            VerticalItem()
        }
    }
}