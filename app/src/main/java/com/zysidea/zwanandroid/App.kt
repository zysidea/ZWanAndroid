package com.zysidea.zwanandroid

import android.app.Application
import android.content.Context

class App:Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}