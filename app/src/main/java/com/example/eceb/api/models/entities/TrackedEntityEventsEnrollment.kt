package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrackedEntityEventsEnrollment(
    @Json(name = "coordinate")
    val coordinate: Coordinate,
    @Json(name = "dataValues")
    val dataValues: List<DataValue>,
    @Json(name = "eventDate")
    val eventDate: String,
    @Json(name = "orgUnit")
    val orgUnit: String,
    @Json(name = "program")
    val program: String,
    @Json(name = "programStage")
    val programStage: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "storedBy")
    val storedBy: String
)