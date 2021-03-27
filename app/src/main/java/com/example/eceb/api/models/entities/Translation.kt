package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Translation(
    @Json(name = "locale")
    val locale: String,
    @Json(name = "property")
    val `property`: String,
    @Json(name = "value")
    val value: String
)