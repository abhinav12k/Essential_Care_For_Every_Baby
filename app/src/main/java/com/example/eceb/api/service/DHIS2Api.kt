package com.example.eceb.api.service

import com.example.eceb.api.models.entities.DataSetResponse
import com.example.eceb.api.models.entities.Event
import com.example.eceb.api.models.requests.AddTrackedEntityInstancesRequest
import com.example.eceb.api.models.requests.AddTrackedEntityRequest
import com.example.eceb.api.models.requests.MultipleEventRegistrationRequest
import com.example.eceb.api.models.requests.TrackedEntityEnrollmentRequest
import com.example.eceb.api.models.responses.*
import com.squareup.moshi.Json
import retrofit2.Response
import retrofit2.http.*

/**
 * Created by abhinav on 24/3/21.
 */
interface DHIS2Api {

    @GET("me")
    suspend fun loginUser(): Response<LoginResponseData>

    @GET("periodTypes")
    suspend fun getDateAndPeriodFormat(): Response<PeriodResponse>

    @GET("dataElements")
    suspend fun getDataElements(
        @Query("paging") paging: Boolean?,
        @Query("page") page: Int?,
        @Query("pageSize") pageSize: Int?,
        @Query("order") order: String?
    ): Response<DataElementsResponse>

    @GET("dataSets/{id}?fields=id,name,organisationUnits[:all]")
    suspend fun getDataSets(
        @Path("id") id: String
    ): Response<DataSetResponse>

    /**FOR GETTING META DATA EXPORTS*/
//    @GET("dataSets/{id}/metadata.json")
//    suspend fun getDataSetsMetaData(
//        @Path("id") id: String
//    ): Response<DataSetMetaDataResponse>
//
//    @GET("programs/{id}/metadata.json")
//    suspend fun getProgramMetaData(
//        @Path("id") id: String
//    ): Response<ProgramMetaDataResponse>
//
//    @GET("categoryCombos/{id}/metadata.json")
//    suspend fun getCategoryCombosMetaData(
//        @Path("id") id: String
//    ): Response<CategoryCombosMetaDataResponse>
//
//    @GET("dashboards/{id}/metadata.json")
//    suspend fun getDashboardMetaData(
//        @Path("id") id: String
//    ): Response<DashboardMetaDataResponse>

    /**TRACKER WEB API**/

    /**TRACKER ENTITY MANAGEMENT**/

    @GET("trackedEntityInstances")
    suspend fun getTrackedEntityInstances(
        @Query("ou") organisationUnit: String,
        @Query("program") programID: String? = null,
        //other filters also available see documentation for that -> device a general method for these filter*
    ): Response<TrackedEntityInstanceResponse>

    @Headers("Content-Type: application/json")
    @POST("trackedEntityInstances")
    suspend fun addTrackedEntityToInstance(
        @Body trackedEntity: AddTrackedEntityRequest
    ): Response<TrackedEntityUpdateResponse>

    @POST("trackedEntityInstances")
    suspend fun addMultipleTrackedEntityToInstance(
        @Body trackedEntity: AddTrackedEntityInstancesRequest
    ): Response<TrackedEntityUpdateResponse>

    @PUT("trackedEntityInstances/{trackedEntityInstanceID}")
    suspend fun updateTrackedEntityInInstance(
        @Path("trackedEntityInstanceID") trackedEntityInstanceId: String,
        @Body trackedEntity: AddTrackedEntityRequest
    ): Response<TrackedEntityUpdateResponse>

    @DELETE("trackedEntityInstances/{trackedEntityInstanceID}")
    suspend fun deleteTrackedEntityInstance(
        @Path("trackedEntityInstanceID") trackedEntityInstanceId: String
    ): Response<TrackedEntityUpdateResponse>

    @GET("trackedEntityAttributes/{id}/requiredValues")
    suspend fun getRequiredTrackedEntityAttributes(
        @Path("id") ownerUid: String
    ): Response<TrackedEntityRequiredAttributesResponse>

    /**ENROLLMENT MANAGEMENT**/
    @POST("enrollments")
    suspend fun enrollTrackedEntity(
        @Body enrollmentRequest: TrackedEntityEnrollmentRequest
    ): Response<TrackedEntityUpdateResponse>

    @PUT("enrollments/{enrollment_id}/cancelled")
    suspend fun cancelTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<TrackedEntityUpdateResponse>

    @PUT("enrollments/{enrollment_id}/completed")
    suspend fun completeTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<TrackedEntityUpdateResponse>

    @DELETE("enrollments/{enrollment_id}")
    suspend fun deleteTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<TrackedEntityUpdateResponse>

    @GET("enrollments")
    suspend fun getEnrollments(
        @Query("ou") organisationUnit: String,
        @Query("program") programID: String? = null,
        //TODO: other filters also available see documentation for that -> device a general method for these filter*
    ): Response<EnrollmentResponse>

    /**EVENTS MANAGEMENT**/
    @GET("events")
    suspend fun getEvents(
        @Query("orgUnit") organisationUnit: String,
        @Query("program") programID: String? = null,
        //other filters also available see documentation for that -> device a general method for these filter*
    ): Response<EventsResponse>

    @POST("events")
    suspend fun registerSingleEvent(
        @Body event: Event
    ): Response<TrackedEntityUpdateResponse>

    @POST("events")
    suspend fun registerMultipleEvents(
        @Body events: MultipleEventRegistrationRequest
    ): Response<TrackedEntityUpdateResponse>

    @PUT("events/{event_id}")
    suspend fun updateEvent(
        @Path("id") id: String,
        @Body event: Event
    ): Response<TrackedEntityUpdateResponse>

    @PUT("events/{event_id}")
    suspend fun deleteEvent(
        @Path("id") id: String
    ): Response<TrackedEntityUpdateResponse>

}