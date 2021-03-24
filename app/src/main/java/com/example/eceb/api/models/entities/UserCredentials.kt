package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserCredentials(
    @Json(name = "access")
    val access: Access,
    @Json(name = "attributeValues")
    val attributeValues: List<Any>,
    @Json(name = "catDimensionConstraints")
    val catDimensionConstraints: List<Any>,
    @Json(name = "cogsDimensionConstraints")
    val cogsDimensionConstraints: List<Any>,
    @Json(name = "created")
    val created: String,
    @Json(name = "disabled")
    val disabled: Boolean,
    @Json(name = "displayName")
    val displayName: String,
    @Json(name = "externalAccess")
    val externalAccess: Boolean,
    @Json(name = "externalAuth")
    val externalAuth: Boolean,
    @Json(name = "favorite")
    val favorite: Boolean,
    @Json(name = "favorites")
    val favorites: List<Any>,
    @Json(name = "id")
    val id: String,
    @Json(name = "invitation")
    val invitation: Boolean,
    @Json(name = "lastLogin")
    val lastLogin: String,
    @Json(name = "lastUpdated")
    val lastUpdated: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "passwordLastUpdated")
    val passwordLastUpdated: String,
    @Json(name = "selfRegistered")
    val selfRegistered: Boolean,
    @Json(name = "translations")
    val translations: List<Any>,
    @Json(name = "twoFA")
    val twoFA: Boolean,
    @Json(name = "userAccesses")
    val userAccesses: List<Any>,
    @Json(name = "userGroupAccesses")
    val userGroupAccesses: List<Any>,
    @Json(name = "userInfo")
    val userInfo: UserInfo,
    @Json(name = "userRoles")
    val userRoles: List<UserRole>,
    @Json(name = "username")
    val username: String
)