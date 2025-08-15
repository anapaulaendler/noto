package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "monthly_performance")
data class MonthlyPerformanceEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val month: Int,
    val year: Int,
    val taskSuccessRate: Double,
    val spendingRate: Double,
    val userId: Long
)
