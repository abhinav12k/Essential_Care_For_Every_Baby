package com.example.eceb.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrackedEntityRequiredAttributesResponse(
    @Json(name = "OPTIONAL")
    val optional: List<String>,
    @Json(name = "REQUIRED")
    val required: List<String>
)