package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao: BaseDao<CategoryEntity> {
    @Query("SELECT * FROM tasks")
    override fun getAll(): Flow<List<CategoryEntity>>

    @Query("SELECT * FROM tasks WHERE id = :id")
    override fun getById(id: Long): Flow<CategoryEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(entity: CategoryEntity)

    @Update
    override suspend fun update(entity: CategoryEntity)

    @Delete
    override suspend fun delete(entity: CategoryEntity)
}