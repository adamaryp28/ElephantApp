package com.example.elephantapp.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [elephantCacheEntity::class], version = 1)
abstract class elephantDatabase: RoomDatabase(){
    companion object{
        val DATABASE_NAME = "ElephantDB"
    }
    abstract fun catDao(): elephantDao
}