package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImportSummary(
    @Json(name = "conflicts")
    val conflicts: List<Conflict>?,
    @Json(name = "enrollments")
    val enrollments: Enrollments?,
    @Json(name = "importCount")
    val importCount: ImportCount?,
    @Json(name = "responseType")
    val responseType: String?,
    @Json(name = "status")
    val status: String?
)