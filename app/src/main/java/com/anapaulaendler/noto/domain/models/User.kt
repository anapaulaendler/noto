package com.anapaulaendler.noto.domain.models

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val passwordHash: String
)
