package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PeriodType(
    @Json(name = "frequencyOrder")
    val frequencyOrder: Int,
    @Json(name = "isoDuration")
    val isoDuration: String,
    @Json(name = "isoFormat")
    val isoFormat: String,
    @Json(name = "name")
    val name: String
)