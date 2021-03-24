package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.PeriodType
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PeriodResponse(
    @Json(name = "periodTypes")
    val periodTypes: List<PeriodType>
)