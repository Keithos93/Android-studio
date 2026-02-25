package com.example.noteapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteapp.ui.theme.component.NoteContent
import com.example.noteapp.ui.theme.component.NoteFab
import com.example.noteapp.ui.theme.component.NoteTopBar
import com.example.noteapp.ui.theme.theme.PurpleGrey40

@Preview
@Composable
fun NoteScreen(){
    Scaffold(
        topBar = {NoteTopBar()},
        floatingActionButton = {NoteFab()},
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) { innerPadding ->
        NoteContent(
            modifier = Modifier.padding(innerPadding)
        )
    }
}



