package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.SpendingEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SpendingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(spending: SpendingEntity): Long

    @Update
    suspend fun update(spending: SpendingEntity)

    @Delete
    suspend fun delete(spending: SpendingEntity)

    @Query("SELECT * FROM spendings WHERE id = :id LIMIT 1")
    suspend fun getById(id: Long): SpendingEntity?

    @Query("SELECT * FROM spendings ORDER BY purchaseDate DESC")
    fun getAll(): Flow<List<SpendingEntity>>
}