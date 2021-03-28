package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Event(
    @Json(name = "assignedUser")
    val assignedUser: String? = null,
    @Json(name = "assignedUserDisplayName")
    val assignedUserDisplayName: String? = null,
    @Json(name = "assignedUserUsername")
    val assignedUserUsername: String? = null,
    @Json(name = "attributeCategoryOptions")
    val attributeCategoryOptions: String? = null,
    @Json(name = "attributeOptionCombo")
    val attributeOptionCombo: String? = null,
    @Json(name = "completedBy")
    val completedBy: String? = null,
    @Json(name = "completedDate")
    val completedDate: String? = null,
    @Json(name = "coordinate")
    val coordinate: Coordinate? = null,
    @Json(name = "created")
    val created: String? = null,
    @Json(name = "createdByUserInfo")
    val createdByUserInfo: CreatedByUserInfo? = null,
    @Json(name = "dataValues")
    val dataValues: List<DataValue>? = null,
    @Json(name = "deleted")
    val deleted: Boolean? = null,
    @Json(name = "dueDate")
    val dueDate: String? = null,
    @Json(name = "enrollment")
    val enrollment: String? = null,
    @Json(name = "enrollmentStatus")
    val enrollmentStatus: String? = null,
    @Json(name = "event")
    val event: String? = null,
    @Json(name = "eventDate")
    val eventDate: String? = null,
    @Json(name = "followup")
    val followup: Boolean? = null,
    @Json(name = "geometry")
    val geometry: Geometry? = null,
    @Json(name = "href")
    val href: String? = null,
    @Json(name = "lastUpdated")
    val lastUpdated: String? = null,
    @Json(name = "lastUpdatedByUserInfo")
    val lastUpdatedByUserInfo: LastUpdatedByUserInfo? = null,
    @Json(name = "notes")
    val notes: List<Note>? = null,
    @Json(name = "orgUnit")
    val orgUnit: String? = null,
    @Json(name = "orgUnitName")
    val orgUnitName: String? = null,
    @Json(name = "program")
    val program: String? = null,
    @Json(name = "programStage")
    val programStage: String? = null,
    @Json(name = "status")
    val status: String? = null,
    @Json(name = "storedBy")
    val storedBy: String? = null,
    @Json(name = "trackedEntityInstance")
    val trackedEntityInstance: String? = null
)