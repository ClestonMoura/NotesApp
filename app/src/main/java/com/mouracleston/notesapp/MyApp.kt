package com.mouracleston.notesapp

import android.app.Application

class MyApp : Application() {

    companion object {
        lateinit var appContainer: AppContainer
    }

    override fun onCreate() {
        super.onCreate()
        appContainer = AppContainerImpl(this)
    }

}