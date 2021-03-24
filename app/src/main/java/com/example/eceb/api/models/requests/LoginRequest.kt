package com.example.eceb.api.models.requests

import com.example.eceb.api.models.entities.LoginData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by abhinav on 24/3/21.
 */

@JsonClass(generateAdapter = true)
data class LoginRequest (
    @Json(name = "user")
    val user: LoginData
)