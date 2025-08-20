package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.SpendingUsageHistoryEntity

import kotlinx.coroutines.flow.Flow

@Dao
interface SpendingUsageHistoryDao: BaseDao<SpendingUsageHistoryEntity> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(history: SpendingUsageHistoryEntity)

    @Update
    override suspend fun update(history: SpendingUsageHistoryEntity)

    @Delete
    override suspend fun delete(history: SpendingUsageHistoryEntity)

    @Query("SELECT * FROM spending_usage_history WHERE spendingId = :spendingId ORDER BY purchaseDate DESC")
    fun getBySpendingId(spendingId: Long): Flow<List<SpendingUsageHistoryEntity>>
}