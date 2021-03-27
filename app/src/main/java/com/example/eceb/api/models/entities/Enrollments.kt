package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Enrollments(
    @Json(name = "deleted")
    val deleted: Int,
    @Json(name = "ignored")
    val ignored: Int,
    @Json(name = "importSummaries")
    val importSummaries: List<Any>,
    @Json(name = "imported")
    val imported: Int,
    @Json(name = "responseType")
    val responseType: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "total")
    val total: Int,
    @Json(name = "updated")
    val updated: Int
)