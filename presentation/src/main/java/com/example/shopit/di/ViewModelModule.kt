package com.example.shopit.di


import com.example.shopit.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule= module {
    viewModel {
        HomeViewModel(get())
    }
}