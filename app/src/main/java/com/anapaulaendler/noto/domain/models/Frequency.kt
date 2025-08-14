package com.anapaulaendler.noto.domain.models

import java.time.LocalDate

data class Frequency(
    val id: Long,
    val type: RecurrenceType,
    val interval: Int,
    val weekdayMask: Int,
    val monthDay: Int?,
    val nthWeek: Int?,
    val weekDay: Weekday?,
    val month: Int?,
    val untilDate: LocalDate?
)
