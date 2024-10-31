package org.example

import org.example.annotation.NotBlank
import org.example.data.CreateCategoryReqeust
import org.example.data.CreateProductRequest
import org.example.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    for(property in properties) {
        if(property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request1 = CreateProductRequest("1", "Sabun", 5000)
    validateRequest(request1)

    val request2 = CreateCategoryReqeust("1", "Body Wash")
    validateRequest(request2)
}