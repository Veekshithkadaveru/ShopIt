package com.example.di

import com.example.domain.repository.ProductRepository
import com.example.repository.ProductRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}