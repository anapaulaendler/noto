package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.TaskEntity
import com.anapaulaendler.noto.domain.model.Task

fun TaskEntity.toDomain() = Task(
    id = id,
    title = title,
    dateTime = dateTime,
    categoryId = categoryId,
    frequencyId = frequencyId,
    description = description,
    completed = completed,
    userId = userId
)

fun Task.toEntity() = TaskEntity(
    id = id,
    title = title,
    dateTime = dateTime,
    categoryId = categoryId,
    frequencyId = frequencyId,
    description = description,
    completed = completed,
    userId = userId
)
