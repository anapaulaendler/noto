package com.anapaulaendler.noto.domain.model

data class MonthlyPerformance(
    val id: Long,
    val month: Int,
    val year: Int,
    val taskSuccessRate: Double,
    val spendingRate: Double,
    val userId: Long
)
