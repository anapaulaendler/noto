package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "events")
data class EventEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val dateTime: LocalDateTime,
    val categoryId: Long,
    val frequencyId: Long?,
    val userId: Long
)
