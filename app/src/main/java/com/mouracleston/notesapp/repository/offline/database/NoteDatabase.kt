package com.mouracleston.notesapp.repository.offline.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mouracleston.notesapp.repository.offline.dao.NoteDao
import com.mouracleston.notesapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract val dao: NoteDao

}