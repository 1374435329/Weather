package com.android.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application(){
    companion object{
        const val TOKEN = "6PM9OEi0lxdiduGs"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}