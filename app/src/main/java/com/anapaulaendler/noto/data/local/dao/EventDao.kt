package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.CategoryEntity
import com.anapaulaendler.noto.data.local.entity.EventEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao: BaseDao<EventEntity> {
    @Query("SELECT * FROM events ORDER BY dateTime")
    override fun getAll(): Flow<List<EventEntity>>

    @Query("SELECT * FROM events WHERE id = :id LIMIT 1")
    override fun getById(id: Long): Flow<EventEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(event: EventEntity)

    @Update
    override suspend fun update(event: EventEntity)

    @Delete
    override suspend fun delete(event: EventEntity)
}