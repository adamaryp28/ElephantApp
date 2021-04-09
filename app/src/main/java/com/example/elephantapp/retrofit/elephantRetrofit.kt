package com.example.elephantapp.retrofit

import retrofit2.http.GET

interface elephantRetrofit {
    @GET("elephants")
    suspend fun get(): List<elephantNetworkEntity>
}