package com.example.eceb.api.models.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrackedEntityEnrollmentRequest(
    @Json(name = "enrollmentDate")
    val enrollmentDate: String,
    @Json(name = "incidentDate")
    val incidentDate: String,
    @Json(name = "orgUnit")
    val orgUnit: String,
    @Json(name = "program")
    val program: String,
    @Json(name = "trackedEntityInstance")
    val trackedEntityInstance: String
)