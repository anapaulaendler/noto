package com.anapaulaendler.noto.data.local.dao

import androidx.room.*
import com.anapaulaendler.noto.data.local.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao: BaseDao<UserEntity> {
    @Query("SELECT * FROM users")
    override fun getAll(): Flow<List<UserEntity>>

    @Query("SELECT * FROM users WHERE id = :id LIMIT 1")
    override fun getById(id: Long): Flow<UserEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(user: UserEntity)

    @Update
    override suspend fun update(user: UserEntity)

    @Delete
    override suspend fun delete(user: UserEntity)
}