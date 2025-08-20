package com.anapaulaendler.noto.utils.converters

import androidx.room.TypeConverter
import com.anapaulaendler.noto.domain.model.RecurrenceType
import com.anapaulaendler.noto.domain.model.Weekday

object EnumConverters {
    @TypeConverter
    @JvmStatic
    fun fromRecurrenceType(type: RecurrenceType?): String? {
        return type?.name
    }

    @TypeConverter
    @JvmStatic
    fun toRecurrenceType(value: String?): RecurrenceType? {
        return value?.let { RecurrenceType.valueOf(it) }
    }

    @TypeConverter
    @JvmStatic
    fun fromWeekday(weekday: Weekday?): String? {
        return weekday?.name
    }

    @TypeConverter
    @JvmStatic
    fun toWeekday(value: String?): Weekday? {
        return value?.let { Weekday.valueOf(it) }
    }
}