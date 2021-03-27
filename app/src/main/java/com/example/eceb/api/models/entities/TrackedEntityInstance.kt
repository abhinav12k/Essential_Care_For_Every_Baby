package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrackedEntityInstance(
    @Json(name = "attributes")
    val attributes: List<Attribute>,
    @Json(name = "created")
    val created: String,
    @Json(name = "createdAtClient")
    val createdAtClient: String,
    @Json(name = "deleted")
    val deleted: Boolean,
    @Json(name = "enrollments")
    val enrollments: List<Any>,
    @Json(name = "featureType")
    val featureType: String,
    @Json(name = "inactive")
    val inactive: Boolean,
    @Json(name = "lastUpdated")
    val lastUpdated: String,
    @Json(name = "orgUnit")
    val orgUnit: String,
    @Json(name = "programOwners")
    val programOwners: List<Any>,
    @Json(name = "relationships")
    val relationships: List<Any>,
    @Json(name = "trackedEntityInstance")
    val trackedEntityInstance: String,
    @Json(name = "trackedEntityType")
    val trackedEntityType: String
)