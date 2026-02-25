package com.example.noteapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteapp.model.Note
import com.example.noteapp.model.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class NoteViewModel (
    private val noteRepository: NoteRepository
): ViewModel() {
    private val _notes = MutableStateFlow<List<Note>>(value = emptyList())
    val notes: StateFlow<List<Note>> = _notes.asStateFlow()

    private var _noteSearched = MutableStateFlow<Note?>(value = null)
    val notesSearched: StateFlow<Note?> = _noteSearched

    init {
        getAllNotes()
    }

    fun getAllNotes() : Flow<List<Note>> = flow {
        noteRepository.getAllNotes().collectLatest { notesUpdated ->
            _notes.value = notesUpdated
        }
    }

    fun insertNote(note: Note) = viewModelScope.launch {
        noteRepository.insertNote(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        noteRepository.updateNote(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        noteRepository.deleteNote(note)
    }

    fun deleteAllNotes() = viewModelScope.launch {
        noteRepository.deleteAllNotes()
    }

    fun getNoteById(id: Int) = viewModelScope.launch {
        noteRepository.getNoteById(id)
    }

}