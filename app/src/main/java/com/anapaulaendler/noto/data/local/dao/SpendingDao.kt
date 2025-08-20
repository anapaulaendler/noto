package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.SpendingEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SpendingDao: BaseDao<SpendingEntity> {
    @Query("SELECT * FROM spendings ORDER BY purchaseDate DESC")
    override fun getAll(): Flow<List<SpendingEntity>>

    @Query("SELECT * FROM spendings WHERE id = :id LIMIT 1")
    override fun getById(id: Long): Flow<SpendingEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(spending: SpendingEntity)

    @Update
    override suspend fun update(spending: SpendingEntity)

    @Delete
    override suspend fun delete(spending: SpendingEntity)
}