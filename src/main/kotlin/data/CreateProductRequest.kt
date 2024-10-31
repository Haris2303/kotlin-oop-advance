package org.example.data

import org.example.annotation.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryReqeust(
    @NotBlank val id: String,
    @NotBlank val name: String
)