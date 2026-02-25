package com.example.noteapp.model

import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDao) {

    suspend fun insertNote(note: Note) { noteDao.insert(note) }

    suspend fun updateNote(note: Note) { noteDao.update(note) }

    suspend fun deleteNote(note: Note) { noteDao.delete(note) }

    suspend fun deleteAllNotes() { noteDao.deleteAll() }

    suspend fun getNoteById(id: Int): Note? { return noteDao.getNoteById(id) }

    fun getAllNotes(): Flow<List<Note>> { return noteDao.getAllNotes() }

    fun searchNotes(query: String): Flow<List<Note>> { return noteDao.searchNotes(query) }
}