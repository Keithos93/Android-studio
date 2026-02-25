package com.example.noteapp.model

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note : Note)

    @Query(value = "DELETE FROM notes")
    fun deleteAll(note : Note)

    @Query(value = "SELECT * FROM notes WHERE id = :id")
    fun getNoteById(id : Int): Note?

    fun getAllNotes() : List<Note>
}