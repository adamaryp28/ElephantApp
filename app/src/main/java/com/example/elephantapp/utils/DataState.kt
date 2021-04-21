package com.example.elephantapp.utils

import com.example.elephantapp.model.elephant
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val elephants: List<elephant>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}