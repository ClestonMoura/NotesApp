package com.mouracleston.notesapp.data

import com.mouracleston.notesapp.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    suspend fun upsertNote(note: Note)

    fun getNotesOrderedByTitle(): Flow<List<Note>>

    fun getNotesOrderedByCreatedAt(): Flow<List<Note>>

}