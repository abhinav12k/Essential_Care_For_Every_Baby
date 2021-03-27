package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pager(
    @Json(name = "nextPage")
    val nextPage: String,
    @Json(name = "page")
    val page: Int,
    @Json(name = "pageCount")
    val pageCount: Int,
    @Json(name = "pageSize")
    val pageSize: Int,
    @Json(name = "total")
    val total: Int
)