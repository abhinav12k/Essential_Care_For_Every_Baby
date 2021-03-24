package com.example.eceb.api.models.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by abhinav on 24/3/21.
 */

@JsonClass(generateAdapter = true)
data class LoginData(
    @Json(name = "username")
    val username: String,
    @Json(name = "password")
    val password: String
)