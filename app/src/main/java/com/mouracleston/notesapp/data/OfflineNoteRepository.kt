package com.mouracleston.notesapp.data

import com.mouracleston.notesapp.model.Note
import kotlinx.coroutines.flow.Flow

class OfflineNoteRepository(private val noteDao: NoteDao) : NoteRepository {

    override suspend fun upsertNote(note: Note) =
        noteDao.upsertNote(note)

    override fun getNotesOrderedByTitle(): Flow<List<Note>> =
        noteDao.getNotesOrderedByTitle()

    override fun getNotesOrderedByCreatedAt(): Flow<List<Note>> =
        noteDao.getNotesOrderedByCreatedAt()

}