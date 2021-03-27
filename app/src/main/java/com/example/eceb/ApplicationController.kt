package com.example.eceb

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

/**
 * Created by abhinav on 25/3/21.
 */
class ApplicationController : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }

    }

}