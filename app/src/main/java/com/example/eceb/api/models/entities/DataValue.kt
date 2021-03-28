package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataValue(
    @Json(name = "created")
    val created: String? = null,
    @Json(name = "createdByUserInfo")
    val createdByUserInfo: CreatedByUserInfo? = null,
    @Json(name = "dataElement")
    val dataElement: String? = null,
    @Json(name = "lastUpdated")
    val lastUpdated: String? = null,
    @Json(name = "lastUpdatedByUserInfo")
    val lastUpdatedByUserInfo: LastUpdatedByUserInfo? = null,
    @Json(name = "providedElsewhere")
    val providedElsewhere: Boolean? = null,
    @Json(name = "storedBy")
    val storedBy: String? = null,
    @Json(name = "value")
    val value: String? = null
)