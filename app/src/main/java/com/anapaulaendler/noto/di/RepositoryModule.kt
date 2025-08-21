package com.anapaulaendler.noto.di

import com.anapaulaendler.noto.data.repository.*
import com.anapaulaendler.noto.domain.interfaces.repository.CategoryRepository
import com.anapaulaendler.noto.domain.interfaces.repository.EventRepository
import com.anapaulaendler.noto.domain.interfaces.repository.FrequencyRepository
import com.anapaulaendler.noto.domain.interfaces.repository.SpendingRepository
import com.anapaulaendler.noto.domain.interfaces.repository.TaskRepository
import com.anapaulaendler.noto.domain.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds @Singleton
    abstract fun bindTaskRepository(
        impl: TaskRepositoryImpl
    ): TaskRepository

    @Binds @Singleton
    abstract fun bindEventRepository(
        impl: EventRepositoryImpl
    ): EventRepository

    @Binds @Singleton
    abstract fun bindSpendingRepository(
        impl: SpendingRepositoryImpl
    ): SpendingRepository

    @Binds @Singleton
    abstract fun bindFrequencyRepository(
        impl: FrequencyRepositoryImpl
    ): FrequencyRepository

    @Binds @Singleton
    abstract fun bindCategoryRepository(
        impl: CategoryRepositoryImpl
    ): CategoryRepository

    @Binds @Singleton
    abstract fun bindPerformanceRepository(
        impl: PerformanceRepositoryImpl
    ): PerformanceRepository
}
