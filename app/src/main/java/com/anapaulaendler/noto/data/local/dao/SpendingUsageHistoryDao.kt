package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.SpendingUsageHistoryEntity

import kotlinx.coroutines.flow.Flow

@Dao
interface SpendingUsageHistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(history: SpendingUsageHistoryEntity): Long

    @Update
    suspend fun update(history: SpendingUsageHistoryEntity)

    @Delete
    suspend fun delete(history: SpendingUsageHistoryEntity)

    @Query("SELECT * FROM spending_usage_history WHERE spendingId = :spendingId ORDER BY purchaseDate DESC")
    fun getBySpendingId(spendingId: Long): Flow<List<SpendingUsageHistoryEntity>>
}