package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.anapaulaendler.noto.domain.model.RecurrenceType
import com.anapaulaendler.noto.domain.model.Weekday
import java.time.LocalDate

@Entity(tableName = "frequencies")
data class FrequencyEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val type: RecurrenceType,
    val interval: Int,
    val weekdayMask: Int?,        // For weekly rules (Mon..Sun)
    val monthDay: Int?,           // 1..31 or -1
    val nthWeek: Int?,            // 1..4 or -1
    val weekDay: Weekday?,        // nullable
    val month: Int?,              // 1..12
    val untilDate: LocalDate?     // nullable
)
