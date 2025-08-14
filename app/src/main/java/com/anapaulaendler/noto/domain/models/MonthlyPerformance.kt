package com.anapaulaendler.noto.domain.models

data class MonthlyPerformance(
    val id: Long,
    val month: Int,
    val year: Int,
    val taskSuccessRate: Double,
    val spendingRate: Double
)
