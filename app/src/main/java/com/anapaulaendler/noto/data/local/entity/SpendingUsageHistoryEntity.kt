package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "spending_usage_history")
data class SpendingUsageHistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val spendingId: Long,
    val purchaseDate: LocalDate,
    val endDate: LocalDate
)
