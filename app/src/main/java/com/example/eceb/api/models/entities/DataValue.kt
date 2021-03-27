package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataValue(
    @Json(name = "dataElement")
    val dataElement: String,
    @Json(name = "value")
    val value: String
)