package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Note(
    @Json(name = "lastUpdated")
    val lastUpdated: String,
    @Json(name = "note")
    val note: String,
    @Json(name = "storedBy")
    val storedBy: String,
    @Json(name = "storedDate")
    val storedDate: String,
    @Json(name = "value")
    val value: String
)