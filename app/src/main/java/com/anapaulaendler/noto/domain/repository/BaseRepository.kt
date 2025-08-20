package com.anapaulaendler.noto.domain.repository

import kotlinx.coroutines.flow.Flow

interface BaseRepository<T> {
    fun getAll(): Flow<List<T>>
    fun getById(id: Long): Flow<T?>
    suspend fun insert(item: T)
    suspend fun update(item: T)
    suspend fun delete(item: T)
}
