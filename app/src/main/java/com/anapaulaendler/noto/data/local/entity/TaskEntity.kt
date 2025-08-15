package com.anapaulaendler.noto.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val dateTime: LocalDateTime,
    val categoryId: Long,
    val frequencyId: Long?,
    val description: String,
    val completed: Boolean,
    val userId: Long
)
