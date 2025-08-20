package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.UserEntity
import com.anapaulaendler.noto.domain.model.User

fun UserEntity.toDomain() = User(
    id = id,
    name = name,
    email = email,
    passwordHash = passwordHash
)

fun User.toEntity() = UserEntity(
    id = id,
    name = name,
    email = email,
    passwordHash = passwordHash
)
