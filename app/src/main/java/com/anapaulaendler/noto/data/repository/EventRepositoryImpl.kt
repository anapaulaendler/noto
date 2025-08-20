package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.EventDao
import com.anapaulaendler.noto.data.local.entity.EventEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Event
import com.anapaulaendler.noto.domain.repository.EventRepository
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    dao: EventDao
) : BaseRepositoryImpl<EventEntity, Event>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), EventRepository
