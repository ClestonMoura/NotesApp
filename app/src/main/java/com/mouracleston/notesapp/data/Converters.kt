package com.mouracleston.notesapp.data

import androidx.room.TypeConverter
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

class Converters {

    @TypeConverter
    fun longToLocalDateTime(value: Long?): LocalDateTime? {
        val instant = Instant.ofEpochMilli(value!!)
        return instant.atZone(ZoneOffset.UTC).toLocalDateTime()
    }

    @TypeConverter
    fun localDateTimeToLong(localDateTime: LocalDateTime?): Long? {
        val instant = localDateTime?.toInstant(ZoneOffset.UTC)
        return instant?.toEpochMilli()
    }

}