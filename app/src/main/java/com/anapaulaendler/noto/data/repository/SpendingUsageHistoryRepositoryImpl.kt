package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.SpendingUsageHistoryDao
import com.anapaulaendler.noto.data.local.entity.SpendingUsageHistoryEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.SpendingUsageHistory
import com.anapaulaendler.noto.domain.interfaces.repository.SpendingUsageHistoryRepository
import javax.inject.Inject

class SpendingUsageHistoryRepositoryImpl @Inject constructor(
    dao: SpendingUsageHistoryDao
) : BaseRepositoryImpl<SpendingUsageHistoryEntity, SpendingUsageHistory>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), SpendingUsageHistoryRepository
