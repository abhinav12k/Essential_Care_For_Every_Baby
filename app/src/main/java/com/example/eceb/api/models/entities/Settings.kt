package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Settings(
    @Json(name = "keyAnalysisDisplayProperty")
    val keyAnalysisDisplayProperty: String,
    @Json(name = "keyMessageEmailNotification")
    val keyMessageEmailNotification: Boolean,
    @Json(name = "keyMessageSmsNotification")
    val keyMessageSmsNotification: Boolean,
    @Json(name = "keyStyle")
    val keyStyle: String,
    @Json(name = "keyUiLocale")
    val keyUiLocale: String
)