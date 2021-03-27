package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coordinate(
    @Json(name = "latitude")
    val latitude: String,
    @Json(name = "longitude")
    val longitude: String
)