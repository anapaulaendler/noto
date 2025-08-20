package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.FrequencyEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FrequencyDao: BaseDao<FrequencyEntity> {
    @Query("SELECT * FROM frequencies")
    override fun getAll(): Flow<List<FrequencyEntity>>

    @Query("SELECT * FROM frequencies WHERE id = :id LIMIT 1")
    override fun getById(id: Long): Flow<FrequencyEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(frequency: FrequencyEntity)

    @Update
    override suspend fun update(frequency: FrequencyEntity)

    @Delete
    override suspend fun delete(frequency: FrequencyEntity)
}