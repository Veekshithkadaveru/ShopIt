package com.example.shopit

import android.app.Application
import com.example.di.dataModule
import com.example.domain.di.domainModule
import com.example.shopit.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShopItApp:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopItApp)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            ))
        }
    }
}