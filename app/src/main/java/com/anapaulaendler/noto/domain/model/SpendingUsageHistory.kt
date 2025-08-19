package com.anapaulaendler.noto.domain.model

import java.time.LocalDate

data class SpendingUsageHistory(
    val id: Long,
    val spendingId: Long,
    val purchaseDate: LocalDate,
    val endDate: LocalDate
)
