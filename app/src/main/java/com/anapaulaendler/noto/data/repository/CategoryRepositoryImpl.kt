package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.CategoryDao
import com.anapaulaendler.noto.data.local.entity.CategoryEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.Category
import com.anapaulaendler.noto.domain.repository.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(
    dao: CategoryDao
) : BaseRepositoryImpl<CategoryEntity, Category>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), CategoryRepository
