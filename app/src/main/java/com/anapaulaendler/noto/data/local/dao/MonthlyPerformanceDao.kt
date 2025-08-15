package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.MonthlyPerformanceEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MonthlyPerformanceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(performance: MonthlyPerformanceEntity): Long

    @Update
    suspend fun update(performance: MonthlyPerformanceEntity)

    @Delete
    suspend fun delete(performance: MonthlyPerformanceEntity)

    @Query("SELECT * FROM monthly_performance WHERE year = :year AND month = :month LIMIT 1")
    suspend fun getByYearMonth(year: Int, month: Int): MonthlyPerformanceEntity?

    @Query("SELECT * FROM monthly_performance ORDER BY year DESC, month DESC")
    fun getAll(): Flow<List<MonthlyPerformanceEntity>>
}