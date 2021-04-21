package com.example.elephantapp.intent

import android.content.Intent

sealed class intent {
object GetElephantsEvent: Intent()
object None: Intent()
}