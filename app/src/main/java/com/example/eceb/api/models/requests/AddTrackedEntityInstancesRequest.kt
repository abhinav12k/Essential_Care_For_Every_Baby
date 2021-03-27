package com.example.eceb.api.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by abhinav on 27/3/21.
 */
@JsonClass(generateAdapter = true)
data class AddTrackedEntityInstancesRequest(
    @Json(name = "trackedEntityInstances")
    val trackedEntityInstances: List<AddTrackedEntityRequest>
)