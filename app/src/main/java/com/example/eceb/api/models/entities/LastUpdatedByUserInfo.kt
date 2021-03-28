package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LastUpdatedByUserInfo(
    @Json(name = "firstName")
    val firstName: String,
    @Json(name = "surname")
    val surname: String,
    @Json(name = "uid")
    val uid: String,
    @Json(name = "username")
    val username: String
)