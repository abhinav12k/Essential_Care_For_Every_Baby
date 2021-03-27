package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attribute(
    @Json(name = "attribute")
    val attribute: String,
    @Json(name = "code")
    val code: String? = null,
    @Json(name = "created")
    val created: String? = null,
    @Json(name = "displayName")
    val displayName: String? = null,
    @Json(name = "lastUpdated")
    val lastUpdated: String? = null,
    @Json(name = "value")
    val value: String,
    @Json(name = "valueType")
    val valueType: String? = null
)