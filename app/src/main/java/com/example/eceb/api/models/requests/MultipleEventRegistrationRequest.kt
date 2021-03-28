package com.example.eceb.api.models.requests

import com.example.eceb.api.models.entities.Event
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by abhinav on 28/3/21.
 */
@JsonClass(generateAdapter = true)
data class MultipleEventRegistrationRequest(
    @Json(name = "events")
    val events: List<Event>
)