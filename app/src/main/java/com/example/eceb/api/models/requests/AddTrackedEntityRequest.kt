package com.example.eceb.api.models.requests


import com.example.eceb.api.models.entities.Attribute
import com.example.eceb.api.models.entities.TrackedEntityEnrollments
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AddTrackedEntityRequest(
    @Json(name = "attributes")
    val attributes: List<Attribute>,
    @Json(name = "geometry")
    val geometry: String? = null,
    @Json(name = "orgUnit")
    val orgUnit: String,
    @Json(name = "trackedEntityType")
    val trackedEntityType: String,
    @Json(name = "enrollments")
    val enrollments: List<TrackedEntityEnrollments>? = null,  //enrollments must be specified for enrolling babies to the program
)