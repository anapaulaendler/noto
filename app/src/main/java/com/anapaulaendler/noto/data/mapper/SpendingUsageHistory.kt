package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.SpendingUsageHistoryEntity
import com.anapaulaendler.noto.domain.model.SpendingUsageHistory

fun SpendingUsageHistoryEntity.toDomain() = SpendingUsageHistory(
    id = id,
    spendingId = spendingId,
    purchaseDate = purchaseDate,
    endDate = endDate
)

fun SpendingUsageHistory.toEntity() = SpendingUsageHistoryEntity(
    id = id,
    spendingId = spendingId,
    purchaseDate = purchaseDate,
    endDate = endDate
)
