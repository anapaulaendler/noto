package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "spendings")
data class SpendingEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val categoryId: Long,
    val price: Double,
    val purchaseDate: LocalDate,
    val endDate: LocalDate?,
    val estimatedDurationDays: Int?,
    val deliveryLeadTimeDays: Int,
    val url: String,
    val frequencyId: Long?,
    val userId: Long
)
