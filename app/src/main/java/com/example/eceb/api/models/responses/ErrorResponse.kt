package com.example.eceb.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "httpStatus")
    val httpStatus: String,
    @Json(name = "httpStatusCode")
    val httpStatusCode: Int,
    @Json(name = "message")
    val message: String,
    @Json(name = "status")
    val status: String
)