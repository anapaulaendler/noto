package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.TaskDao
import com.anapaulaendler.noto.data.local.entity.TaskEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Task
import com.anapaulaendler.noto.domain.repository.TaskRepository
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    dao: TaskDao
) : BaseRepositoryImpl<TaskEntity, Task>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), TaskRepository
