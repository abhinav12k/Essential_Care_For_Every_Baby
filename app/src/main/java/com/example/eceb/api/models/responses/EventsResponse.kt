package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.Event
import com.example.eceb.api.models.entities.Pager
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EventsResponse(
    @Json(name = "events")
    val events: List<Event>?,
    @Json(name = "pager")
    val pager: Pager?
)