package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.TrackedEntityInstance
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrackedEntityInstanceResponse(
    @Json(name = "trackedEntityInstances")
    val trackedEntityInstances: List<TrackedEntityInstance>
)