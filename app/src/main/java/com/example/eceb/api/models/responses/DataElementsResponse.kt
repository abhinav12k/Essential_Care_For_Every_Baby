package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.DataElement
import com.example.eceb.api.models.entities.Pager
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataElementsResponse(
    @Json(name = "dataElements")
    val dataElements: List<DataElement>,
    @Json(name = "pager")
    val pager: Pager
)