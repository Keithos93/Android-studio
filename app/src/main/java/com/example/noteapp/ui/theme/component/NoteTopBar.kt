package com.example.noteapp.ui.theme.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteapp.ui.theme.theme.Pink40

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteTopBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Pink40),
        title = {
            OutlinedTextField(
                value = "Research Note",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent
                )
            )
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = Color.White
            )
        }

    )

}