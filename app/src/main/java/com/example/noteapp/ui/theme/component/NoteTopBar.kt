package com.example.noteapp.ui.theme.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    disabledContainerColor = Color.Transparent,
                    focusedTextColor = Color.Black,
                ),
                shape = RoundedCornerShape(60.dp),
                trailingIcon = {
                    IconButton(
                        onClick = { }
                    ){
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                },
                modifier = Modifier.padding(10.dp),
                textStyle = TextStyle(
                    fontSize = 12.sp
                )

            )
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
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