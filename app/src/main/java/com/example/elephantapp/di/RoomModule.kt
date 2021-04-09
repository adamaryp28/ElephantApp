package com.example.elephantapp.di

import android.content.Context
import androidx.room.Room
import com.example.elephantapp.room.elephantDao
import com.example.elephantapp.room.elephantDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RoomModule {
    @Singleton
    @Provides
    fun provideCatDb(@ApplicationContext context: Context): elephantDatabase {
        return Room
            .databaseBuilder(context, elephantDatabase::class.java, elephantDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideCatDao(elephantDatabase: elephantDatabase): elephantDao {
        return elephantDatabase.catDao()
    }
}