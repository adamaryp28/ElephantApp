package com.example.elephantapp.repository

import com.example.elephantapp.retrofit.NetworkMapper
import com.example.elephantapp.retrofit.elephantRetrofit
import com.example.elephantapp.room.CacheMapper
import com.example.elephantapp.room.elephantDao
import com.example.elephantapp.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class elephantRepository (
    private val elephantDao: elephantDao,
    private val elephantRetrofit: elephantRetrofit,
    private val cacheMapper: CacheMapper,
    private val NetworkMapper: NetworkMapper
    ) {
        suspend fun getelephants(): Flow<DataState> = flow {
            emit(DataState.Loading)
            delay(1000)
            try {
                val elephantData = elephantRetrofit.get()
                val elephantMap = NetworkMapper.mapFromEntityList(elephantData)
                for (tempEl in elephantMap ){
                    elephantDao.insert(cacheMapper.mapToEntity(tempEl))
                }
                val cacheElephant = elephantDao.get()
                emit(DataState.Success(cacheMapper.mapFromEntityList(cacheElephant)))
            }catch (e: Exception){
                emit(DataState.Error(e))
            }
        }
}