package com.anapaulaendler.noto.data.local.converter

import androidx.room.TypeConverter
import com.anapaulaendler.noto.domain.models.Weekday

object WeekdayEnumConverter {

    @TypeConverter
    @JvmStatic
    fun fromWeekday(value: Weekday?): String? {
        return value?.name
    }

    @TypeConverter
    @JvmStatic
    fun toWeekday(value: String?): Weekday? {
        return value?.let { Weekday.valueOf(it) }
    }
}