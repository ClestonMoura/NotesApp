package com.mouracleston.notesapp

import android.content.Context
import com.mouracleston.notesapp.data.NoteDatabase
import com.mouracleston.notesapp.data.NoteRepository
import com.mouracleston.notesapp.data.OfflineNoteRepository

interface AppContainer {

    val noteRepository: NoteRepository

}

class AppContainerImpl(private val context: Context) : AppContainer {

    override val noteRepository: NoteRepository by lazy {
        OfflineNoteRepository(NoteDatabase.getDatabase(context).noteDao())
    }

}