package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.MonthlyPerformanceEntity
import com.anapaulaendler.noto.domain.model.MonthlyPerformance

fun MonthlyPerformanceEntity.toDomain() = MonthlyPerformance(
    id = id,
    month = month,
    year = year,
    taskSuccessRate = taskSuccessRate,
    spendingRate = spendingRate,
    userId = userId
)

fun MonthlyPerformance.toEntity() = MonthlyPerformanceEntity(
    id = id,
    month = month,
    year = year,
    taskSuccessRate = taskSuccessRate,
    spendingRate = spendingRate,
    userId = userId
)
