package com.example.elephantapp.di

import com.example.elephantapp.repository.elephantRepository
import com.example.elephantapp.retrofit.NetworkMapper
import com.example.elephantapp.retrofit.elephantRetrofit
import com.example.elephantapp.room.CacheMapper
import com.example.elephantapp.room.elephantDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideElephantRepository(
        elephantDao: elephantDao,
        elephantRetrofit: elephantRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): elephantRepository {
        return elephantRepository(elephantDao, elephantRetrofit, cacheMapper, networkMapper)
    }
}