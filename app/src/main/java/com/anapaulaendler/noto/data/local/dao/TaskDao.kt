package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.TaskEntity

import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: TaskEntity): Long

    @Update
    suspend fun update(task: TaskEntity)

    @Delete
    suspend fun delete(task: TaskEntity)

    @Query("SELECT * FROM tasks WHERE id = :id LIMIT 1")
    suspend fun getById(id: Long): TaskEntity?

    @Query("SELECT * FROM tasks WHERE completed = :isCompleted ORDER BY dateTime")
    fun getByCompletion(isCompleted: Boolean): Flow<List<TaskEntity>>

    @Query("SELECT * FROM tasks ORDER BY dateTime")
    fun getAll(): Flow<List<TaskEntity>>
}