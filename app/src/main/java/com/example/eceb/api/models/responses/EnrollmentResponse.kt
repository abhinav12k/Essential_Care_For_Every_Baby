package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.Enrollment
import com.example.eceb.api.models.entities.Pager
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EnrollmentResponse(
    @Json(name = "enrollments")
    val enrollments: List<Enrollment>?,
    @Json(name = "pager")
    val pager: Pager?
)