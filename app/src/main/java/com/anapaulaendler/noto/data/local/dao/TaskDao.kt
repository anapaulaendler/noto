package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.TaskEntity

import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao: BaseDao<TaskEntity> {
    @Query("SELECT * FROM tasks ORDER BY dateTime")
    override fun getAll(): Flow<List<TaskEntity>>

    @Query("SELECT * FROM tasks WHERE id = :id LIMIT 1")
    override fun getById(id: Long): Flow<TaskEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(task: TaskEntity)

    @Update
    override suspend fun update(task: TaskEntity)

    @Delete
    override suspend fun delete(task: TaskEntity)

    @Query("SELECT * FROM tasks WHERE completed = :isCompleted ORDER BY dateTime")
    fun getByCompletion(isCompleted: Boolean): Flow<List<TaskEntity>>
}