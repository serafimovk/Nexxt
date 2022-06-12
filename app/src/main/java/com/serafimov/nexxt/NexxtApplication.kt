package com.serafimov.nexxt

import android.app.Application
import com.serafimov.nexxt.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.compose.BuildConfig
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class NexxtApplication: Application() {

  override fun onCreate() {
    super.onCreate()
    startKoin {
      androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
      androidContext(this@NexxtApplication)
      modules(koinModule)
    }
  }

}