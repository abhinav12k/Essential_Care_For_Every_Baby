package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Geometry(
    @Json(name = "coordinates")
    val coordinates: List<Any>,
    @Json(name = "type")
    val type: String
)