package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.TaskDao
import com.anapaulaendler.noto.data.local.entity.TaskEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Task
import com.anapaulaendler.noto.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val dao: TaskDao
) : BaseRepository<TaskEntity, Task, Long>(
    toDomainMapper = { it.toDomain() },
    toEntityMapper = { it.toEntity() }
), TaskRepository {

    override suspend fun insertEntity(entity: TaskEntity) = dao.insert(entity)
    override suspend fun updateEntity(entity: TaskEntity) = dao.update(entity)
    override suspend fun deleteEntity(entity: TaskEntity) = dao.delete(entity)

    override fun getAllEntities(): Flow<List<TaskEntity>> = dao.getAll()
    override fun getEntityById(id: Long): Flow<TaskEntity?> = dao.getById(id)
}