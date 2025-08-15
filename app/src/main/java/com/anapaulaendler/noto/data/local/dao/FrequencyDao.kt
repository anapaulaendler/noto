package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.FrequencyEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FrequencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(frequency: FrequencyEntity): Long

    @Update
    suspend fun update(frequency: FrequencyEntity)

    @Delete
    suspend fun delete(frequency: FrequencyEntity)

    @Query("SELECT * FROM frequencies WHERE id = :id LIMIT 1")
    suspend fun getById(id: Long): FrequencyEntity?

    @Query("SELECT * FROM frequencies")
    fun getAll(): Flow<List<FrequencyEntity>>
}