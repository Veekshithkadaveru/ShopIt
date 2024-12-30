package com.example.model

import com.example.domain.model.Product
import kotlinx.serialization.Serializable

@Serializable
class DataProductModel(
    val id: Long,
    val title: String,
    val price: Double,
    val category: String,
    val description: String,
    val image: String
) {

    fun toProduct() = Product(
        id, title, price, category, description, image
    )
}