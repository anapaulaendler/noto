package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.SpendingDao
import com.anapaulaendler.noto.data.local.entity.SpendingEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Spending
import com.anapaulaendler.noto.domain.repository.SpendingRepository
import javax.inject.Inject

class SpendingRepositoryImpl @Inject constructor(
    dao: SpendingDao
) : BaseRepositoryImpl<SpendingEntity, Spending>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), SpendingRepository
