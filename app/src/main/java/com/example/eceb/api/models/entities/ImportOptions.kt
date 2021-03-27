package com.example.eceb.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImportOptions(
    @Json(name = "async")
    val async: Boolean,
    @Json(name = "datasetAllowsPeriods")
    val datasetAllowsPeriods: Boolean,
    @Json(name = "dryRun")
    val dryRun: Boolean,
    @Json(name = "firstRowIsHeader")
    val firstRowIsHeader: Boolean,
    @Json(name = "force")
    val force: Boolean,
    @Json(name = "idSchemes")
    val idSchemes: IdSchemes,
    @Json(name = "ignoreEmptyCollection")
    val ignoreEmptyCollection: Boolean,
    @Json(name = "importStrategy")
    val importStrategy: String,
    @Json(name = "mergeDataValues")
    val mergeDataValues: Boolean,
    @Json(name = "mergeMode")
    val mergeMode: String,
    @Json(name = "reportMode")
    val reportMode: String,
    @Json(name = "requireAttributeOptionCombo")
    val requireAttributeOptionCombo: Boolean,
    @Json(name = "requireCategoryOptionCombo")
    val requireCategoryOptionCombo: Boolean,
    @Json(name = "sharing")
    val sharing: Boolean,
    @Json(name = "skipAudit")
    val skipAudit: Boolean,
    @Json(name = "skipCache")
    val skipCache: Boolean,
    @Json(name = "skipExistingCheck")
    val skipExistingCheck: Boolean,
    @Json(name = "skipLastUpdated")
    val skipLastUpdated: Boolean,
    @Json(name = "skipNotifications")
    val skipNotifications: Boolean,
    @Json(name = "skipPatternValidation")
    val skipPatternValidation: Boolean,
    @Json(name = "strictAttributeOptionCombos")
    val strictAttributeOptionCombos: Boolean,
    @Json(name = "strictCategoryOptionCombos")
    val strictCategoryOptionCombos: Boolean,
    @Json(name = "strictDataElements")
    val strictDataElements: Boolean,
    @Json(name = "strictOrganisationUnits")
    val strictOrganisationUnits: Boolean,
    @Json(name = "strictPeriods")
    val strictPeriods: Boolean
)