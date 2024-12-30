package com.example.domain.usecase

import com.example.domain.repository.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {

    suspend fun execute() = repository.getProducts()
}