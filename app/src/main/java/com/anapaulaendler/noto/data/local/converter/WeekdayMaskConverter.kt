package com.anapaulaendler.noto.data.local.converter

import androidx.room.TypeConverter
import com.anapaulaendler.noto.domain.model.Weekday

object WeekdayMaskConverter {

    @TypeConverter
    @JvmStatic
    fun fromWeekdayList(days: List<Weekday>?): Int? {
        return days?.fold(0) { acc, day -> acc or (1 shl day.ordinal) }
    }

    @TypeConverter
    @JvmStatic
    fun toWeekdayList(mask: Int?): List<Weekday>? {
        return mask?.let { m ->
            Weekday.entries.filter { day -> (m and (1 shl day.ordinal)) != 0 }
        }
    }
}