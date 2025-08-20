package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.BaseDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import com.anapaulaendler.noto.domain.repository.BaseRepository

abstract class BaseRepositoryImpl<E, D>(
    private val dao: BaseDao<E>,
    private val toDomain: (E) -> D,
    private val toEntity: (D) -> E
) : BaseRepository<D> {

    override fun getAll(): Flow<List<D>> =
        dao.getAll().map { list -> list.map { toDomain(it) } }

    override fun getById(id: Long): Flow<D?> =
        dao.getById(id).map { it?.let { toDomain(it) } }

    override suspend fun insert(item: D) {
        dao.insert(toEntity(item))
    }

    override suspend fun update(item: D) {
        dao.update(toEntity(item))
    }

    override suspend fun delete(item: D) {
        dao.delete(toEntity(item))
    }
}
