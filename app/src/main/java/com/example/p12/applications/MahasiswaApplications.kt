package com.example.p12.applications



import android.app.Application
import com.example.p12.dependenciesinjection.AppContainer
import com.example.p12.dependenciesinjection.MahasiswaContainer

class MahasiswaApplications : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}