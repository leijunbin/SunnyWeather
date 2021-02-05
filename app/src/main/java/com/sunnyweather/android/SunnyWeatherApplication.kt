package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object{
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "cjVEVQndqLbtJ7H8"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}