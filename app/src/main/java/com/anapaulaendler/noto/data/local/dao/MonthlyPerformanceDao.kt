package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.MonthlyPerformanceEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MonthlyPerformanceDao: BaseDao<MonthlyPerformanceEntity> {
    @Query("SELECT * FROM monthly_performance ORDER BY year DESC, month DESC")
    override fun getAll(): Flow<List<MonthlyPerformanceEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(performance: MonthlyPerformanceEntity)

    @Update
    override suspend fun update(performance: MonthlyPerformanceEntity)

    @Delete
    override suspend fun delete(performance: MonthlyPerformanceEntity)

    @Query("SELECT * FROM monthly_performance WHERE year = :year AND month = :month LIMIT 1")
    suspend fun getByYearMonth(year: Int, month: Int): Flow<MonthlyPerformanceEntity?>
}