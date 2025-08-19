package com.anapaulaendler.noto.domain.model

import java.time.LocalDateTime

data class Task(
    override val id: Long,
    override val title: String,
    override val dateTime: LocalDateTime,
    override val categoryId: Long,
    override val frequencyId: Long?,
    val description: String,
    val completed: Boolean
) : Schedulable
