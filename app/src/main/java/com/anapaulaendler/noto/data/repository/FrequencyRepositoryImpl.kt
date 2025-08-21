package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.FrequencyDao
import com.anapaulaendler.noto.data.local.entity.FrequencyEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Frequency
import com.anapaulaendler.noto.domain.interfaces.repository.FrequencyRepository
import javax.inject.Inject

class FrequencyRepositoryImpl @Inject constructor(
    dao: FrequencyDao
) : BaseRepositoryImpl<FrequencyEntity, Frequency>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), FrequencyRepository
