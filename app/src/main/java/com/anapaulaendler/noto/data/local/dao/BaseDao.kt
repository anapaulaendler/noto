package com.anapaulaendler.noto.data.local.dao

import kotlinx.coroutines.flow.Flow

interface BaseDao<E> {
    fun getAll(): Flow<List<E>>
    fun getById(id: Long): Flow<E?>
    suspend fun insert(entity: E)
    suspend fun update(entity: E)
    suspend fun delete(entity: E)
}
