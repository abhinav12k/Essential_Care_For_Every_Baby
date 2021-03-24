package com.example.eceb.api.models.responses


import com.example.eceb.api.models.entities.Access
import com.example.eceb.api.models.entities.OrganisationUnit
import com.example.eceb.api.models.entities.Settings
import com.example.eceb.api.models.entities.UserCredentials
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginResponseData(
    @Json(name = "access")
    val access: Access,
    @Json(name = "attributeValues")
    val attributeValues: List<Any>,
    @Json(name = "authorities")
    val authorities: List<String>,
    @Json(name = "created")
    val created: String,
    @Json(name = "dataSets")
    val dataSets: List<String>,
    @Json(name = "dataViewOrganisationUnits")
    val dataViewOrganisationUnits: List<Any>,
    @Json(name = "displayName")
    val displayName: String,
    @Json(name = "externalAccess")
    val externalAccess: Boolean,
    @Json(name = "favorite")
    val favorite: Boolean,
    @Json(name = "favorites")
    val favorites: List<Any>,
    @Json(name = "firstName")
    val firstName: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "lastUpdated")
    val lastUpdated: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "organisationUnits")
    val organisationUnits: List<OrganisationUnit>,
    @Json(name = "programs")
    val programs: List<String>,
    @Json(name = "settings")
    val settings: Settings,
    @Json(name = "surname")
    val surname: String,
    @Json(name = "teiSearchOrganisationUnits")
    val teiSearchOrganisationUnits: List<Any>,
    @Json(name = "translations")
    val translations: List<Any>,
    @Json(name = "userAccesses")
    val userAccesses: List<Any>,
    @Json(name = "userCredentials")
    val userCredentials: UserCredentials,
    @Json(name = "userGroupAccesses")
    val userGroupAccesses: List<Any>,
    @Json(name = "userGroups")
    val userGroups: List<Any>
)