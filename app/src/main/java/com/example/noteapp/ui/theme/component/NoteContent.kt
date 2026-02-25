package com.example.noteapp.ui.theme.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteapp.model.Note
import com.example.noteapp.ui.theme.theme.PurpleGrey40

@Preview
@Composable
fun NoteContent(modifier: Modifier = Modifier) {

    val notes = listOf(
        Note(
            title = "Note1",
            content = "Contenu de la note 1"
        )
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)
    ) {
        items(notes, key= { it.id }){note ->
            NoteItem(note = note)
        }
    }

}