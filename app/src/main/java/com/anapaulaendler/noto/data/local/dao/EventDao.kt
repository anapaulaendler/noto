package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.EventEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(event: EventEntity): Long

    @Update
    suspend fun update(event: EventEntity)

    @Delete
    suspend fun delete(event: EventEntity)

    @Query("SELECT * FROM events WHERE id = :id LIMIT 1")
    suspend fun getById(id: Long): EventEntity?

    @Query("SELECT * FROM events ORDER BY dateTime")
    fun getAll(): Flow<List<EventEntity>>
}