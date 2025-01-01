package com.example.shopit.di

import org.koin.dsl.module

val presentationModule = module {
    includes(viewModelModule)
}