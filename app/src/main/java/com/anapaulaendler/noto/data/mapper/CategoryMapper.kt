package com.anapaulaendler.noto.data.mapper

import com.anapaulaendler.noto.data.local.entity.CategoryEntity
import com.anapaulaendler.noto.domain.model.Category

fun CategoryEntity.toDomain() = Category(
    id = id,
    name = name,
    colorHex = colorHex
)

fun Category.toEntity() = CategoryEntity(
    id = id,
    name = name,
    colorHex = colorHex
)
