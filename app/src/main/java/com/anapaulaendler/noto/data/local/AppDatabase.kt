package com.anapaulaendler.noto.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.anapaulaendler.noto.data.local.dao.*
import com.anapaulaendler.noto.data.local.entity.*
import com.anapaulaendler.noto.utils.converters.DateConverters
import com.anapaulaendler.noto.utils.converters.EnumConverters

@Database(
    entities = [
        UserEntity::class,
        CategoryEntity::class,
        FrequencyEntity::class,
        TaskEntity::class,
        EventEntity::class,
        SpendingEntity::class,
        SpendingUsageHistoryEntity::class,
        MonthlyPerformanceEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    DateConverters::class,
    EnumConverters::class
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun categoryDao(): CategoryDao
    abstract fun frequencyDao(): FrequencyDao
    abstract fun taskDao(): TaskDao
    abstract fun eventDao(): EventDao
    abstract fun spendingDao(): SpendingDao
    abstract fun spendingUsageHistoryDao(): SpendingUsageHistoryDao
    abstract fun monthlyPerformanceDao(): MonthlyPerformanceDao
}