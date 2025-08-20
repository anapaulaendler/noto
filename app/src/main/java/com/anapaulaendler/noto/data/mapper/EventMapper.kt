package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.EventEntity
import com.anapaulaendler.noto.domain.model.Event

fun EventEntity.toDomain() = Event(
    id = id,
    title = title,
    dateTime = dateTime,
    categoryId = categoryId,
    frequencyId = frequencyId,
    userId = userId
)

fun Event.toEntity() = EventEntity(
    id = id,
    title = title,
    dateTime = dateTime,
    categoryId = categoryId,
    frequencyId = frequencyId,
    userId = userId
)
