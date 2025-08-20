package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.UserDao
import com.anapaulaendler.noto.data.local.entity.UserEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.User
import com.anapaulaendler.noto.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    dao: UserDao
) : BaseRepositoryImpl<UserEntity, User>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), UserRepository
