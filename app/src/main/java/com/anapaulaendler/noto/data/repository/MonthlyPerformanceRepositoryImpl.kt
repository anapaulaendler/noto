package com.anapaulaendler.noto.data.repository

import com.anapaulaendler.noto.data.local.dao.MonthlyPerformanceDao
import com.anapaulaendler.noto.data.local.entity.MonthlyPerformanceEntity
import com.anapaulaendler.noto.data.mapper.toDomain
import com.anapaulaendler.noto.data.mapper.toEntity
import com.anapaulaendler.noto.domain.model.MonthlyPerformance
import com.anapaulaendler.noto.domain.repository.MonthlyPerformanceRepository
import javax.inject.Inject

class MonthlyPerformanceRepositoryImpl @Inject constructor(
    dao: MonthlyPerformanceDao
) : BaseRepositoryImpl<MonthlyPerformanceEntity, MonthlyPerformance>(
    dao = dao,
    toDomain = { it.toDomain() },
    toEntity = { it.toEntity() }
), MonthlyPerformanceRepository
