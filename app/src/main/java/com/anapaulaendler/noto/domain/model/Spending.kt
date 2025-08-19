package com.anapaulaendler.noto.domain.model

import java.time.LocalDate

data class Spending(
    val id: Long,
    val name: String,
    val categoryId: Long,
    val price: Double,
    val purchaseDate: LocalDate,
    val endDate: LocalDate?,
    val estimatedDurationDays: Int?,
    val deliveryLeadTimeDays: Int,
    val url: String,
    val frequencyId: Long?
)
