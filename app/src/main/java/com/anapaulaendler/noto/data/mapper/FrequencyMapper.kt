package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.FrequencyEntity
import com.anapaulaendler.noto.domain.model.Frequency

fun FrequencyEntity.toDomain() = Frequency(
    id = id,
    type = type,
    interval = interval,
    weekdayMask = weekdayMask,
    monthDay = monthDay,
    nthWeek = nthWeek,
    weekDay = weekDay,
    month = month,
    untilDate = untilDate
)

fun Frequency.toEntity() = FrequencyEntity(
    id = id,
    type = type,
    interval = interval,
    weekdayMask = weekdayMask,
    monthDay = monthDay,
    nthWeek = nthWeek,
    weekDay = weekDay,
    month = month,
    untilDate = untilDate
)
