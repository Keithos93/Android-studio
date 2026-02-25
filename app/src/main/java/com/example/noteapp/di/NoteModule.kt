package com.example.noteapp.di

import android.content.Context
import androidx.room.Room
import com.example.noteapp.model.NoteDao
import com.example.noteapp.model.NoteDatabase
import com.example.noteapp.model.NoteRepository
import com.example.noteapp.viewmodel.NoteViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    // DEFINIR LES DIFFERENTES DEPENDANCE POUR NOTRE PROJET
    @Provides
    @Singleton
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ): NoteDatabase {
        return Room.databaseBuilder(
            context,
            NoteDatabase::class.java, "note_db").build()
    }

    @Provides
    @Singleton
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()

    @Provides
    @Singleton
    fun provideNoteRepository(noteDao: NoteDao) = NoteRepository(noteDao)

    @Provides
    @Singleton
    fun provideNoteViewModel(noteRepository: NoteRepository) = NoteViewModel(noteRepository)


}