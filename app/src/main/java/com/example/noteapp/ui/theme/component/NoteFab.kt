package com.example.noteapp.ui.theme.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteapp.ui.theme.theme.Pink40

@Preview
@Composable
fun NoteFab() {

    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Pink40
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            tint = Color.White
        )
    }

}