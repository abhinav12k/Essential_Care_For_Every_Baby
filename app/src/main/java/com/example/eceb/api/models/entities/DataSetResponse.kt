package com.example.eceb.api.models.entities


import com.example.eceb.api.models.entities.OrganisationUnit
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataSetResponse(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "organisationUnits")
    val organisationUnits: List<OrganisationUnit>
)