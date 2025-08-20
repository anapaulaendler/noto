package com.anapaulaendler.noto.data.local.converter

import androidx.room.TypeConverter
import com.anapaulaendler.noto.domain.model.RecurrenceType

object RecurrenceTypeConverter {

    @TypeConverter
    @JvmStatic
    fun fromRecurrenceType(value: RecurrenceType?): String? {
        return value?.name
    }

    @TypeConverter
    @JvmStatic
    fun toRecurrenceType(value: String?): RecurrenceType? {
        return value?.let { RecurrenceType.valueOf(it) }
    }
}
