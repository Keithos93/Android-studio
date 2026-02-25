package com.example.noteapp.model

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note : Note)

    @Query(value = "DELETE FROM notes")
    fun deleteAll()

    @Query(value = "SELECT * FROM notes WHERE id = :id")
    fun getNoteById(id : Int): Note?

    @Query(value = "SELECT * FROM notes")
    fun getAllNotes() : Flow<List<Note>>

    @Query("SELECT * FROM notes WHERE title_note LIKE '%' || :query || '%'")
    fun searchNotes(query: String): Flow<List<Note>>
}