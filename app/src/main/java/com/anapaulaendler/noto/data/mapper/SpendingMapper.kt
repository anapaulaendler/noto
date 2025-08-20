package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.SpendingEntity
import com.anapaulaendler.noto.domain.model.Spending

fun SpendingEntity.toDomain() = Spending(
    id = id,
    name = name,
    categoryId = categoryId,
    price = price,
    purchaseDate = purchaseDate,
    endDate = endDate,
    estimatedDurationDays = estimatedDurationDays,
    deliveryLeadTimeDays = deliveryLeadTimeDays,
    url = url,
    frequencyId = frequencyId,
    userId = userId
)

fun Spending.toEntity() = SpendingEntity(
    id = id,
    name = name,
    categoryId = categoryId,
    price = price,
    purchaseDate = purchaseDate,
    endDate = endDate,
    estimatedDurationDays = estimatedDurationDays,
    deliveryLeadTimeDays = deliveryLeadTimeDays,
    url = url,
    frequencyId = frequencyId,
    userId = userId
)
