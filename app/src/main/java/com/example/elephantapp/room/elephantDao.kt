package com.example.elephantapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface elephantDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(catEntity: elephantCacheEntity): Long
    @Query("select * from elefante")
    suspend fun get(): List<elephantCacheEntity>
}