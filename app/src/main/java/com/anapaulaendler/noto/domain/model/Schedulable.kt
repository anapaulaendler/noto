package com.anapaulaendler.noto.domain.model

import java.time.LocalDateTime

interface Schedulable {
    val id: Long
    val title: String
    val dateTime: LocalDateTime
    val categoryId: Long
    val frequencyId: Long?
    val userId: Long
}