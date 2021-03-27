package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Enrollment(
    @Json(name = "created")
    val created: String,
    @Json(name = "enrollment")
    val enrollment: String,
    @Json(name = "enrollmentDate")
    val enrollmentDate: String,
    @Json(name = "followup")
    val followup: Boolean,
    @Json(name = "incidentDate")
    val incidentDate: String,
    @Json(name = "lastUpdated")
    val lastUpdated: String,
    @Json(name = "orgUnit")
    val orgUnit: String,
    @Json(name = "orgUnitName")
    val orgUnitName: String,
    @Json(name = "program")
    val program: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "trackedEntityInstance")
    val trackedEntityInstance: String,
    @Json(name = "trackedEntityType")
    val trackedEntityType: String
)