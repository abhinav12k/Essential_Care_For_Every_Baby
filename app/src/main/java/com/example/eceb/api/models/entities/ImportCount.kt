package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImportCount(
    @Json(name = "deleted")
    val deleted: Int,
    @Json(name = "ignored")
    val ignored: Int,
    @Json(name = "imported")
    val imported: Int,
    @Json(name = "updated")
    val updated: Int
)