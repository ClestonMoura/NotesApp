package com.mouracleston.notesapp.repository.offline.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.mouracleston.notesapp.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Upsert
    suspend fun upsertNote(note: Note)

    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getNotesOrderedByTitle(): Flow<List<Note>>

    @Query("SELECT * FROM note ORDER BY createdAt ASC")
    fun getNotesOrderedByCreatedAt(): Flow<List<Note>>

}