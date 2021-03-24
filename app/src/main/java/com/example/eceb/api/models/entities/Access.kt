package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Access(
    @Json(name = "delete")
    val delete: Boolean,
    @Json(name = "externalize")
    val externalize: Boolean,
    @Json(name = "manage")
    val manage: Boolean,
    @Json(name = "read")
    val read: Boolean,
    @Json(name = "update")
    val update: Boolean,
    @Json(name = "write")
    val write: Boolean
)