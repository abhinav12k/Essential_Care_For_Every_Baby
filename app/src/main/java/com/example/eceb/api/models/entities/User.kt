package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "displayName")
    val displayName: String?,
    @Json(name = "id")
    val id: String,
    @Json(name = "username")
    val username: String?
)