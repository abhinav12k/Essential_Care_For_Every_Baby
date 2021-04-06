package com.example.eceb.api.service

import com.example.eceb.api.models.entities.DataElement
import com.example.eceb.api.models.entities.DataSetResponse
import com.example.eceb.api.models.entities.Event
import com.example.eceb.api.models.requests.AddTrackedEntityInstancesRequest
import com.example.eceb.api.models.requests.AddTrackedEntityRequest
import com.example.eceb.api.models.requests.MultipleEventRegistrationRequest
import com.example.eceb.api.models.requests.TrackedEntityEnrollmentRequest
import com.example.eceb.api.models.responses.*
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
    suspend fun getDataElementsList(
        @Query("paging") paging: Boolean?,
        @Query("page") page: Int?,
        @Query("pageSize") pageSize: Int?,
        @Query("order") order: String?
    ): Response<DataElementsResponse>

    @GET("dataElements/{id}")
    suspend fun getDataElementByID(
        @Path("id") id: String,
    ): Response<DataElement>

    @GET("dataSets/{id}?fields=id,name,organisationUnits[:all]")
    suspend fun getDataSets(
        @Path("id") id: String
    ): Response<DataSetResponse>

    /**TRACKER WEB API**/

    /**TRACKER ENTITY MANAGEMENT**/

    @GET("trackedEntityInstances")
    suspend fun getTrackedEntityInstances(
        @Query("ou") organisationUnit: String,
        @Query("program") programID: String? = null,
    ): Response<TrackedEntityInstanceResponse>

    @Headers("Content-Type: application/json")
    @POST("trackedEntityInstances")
    suspend fun addTrackedEntityToInstance(
        @Body trackedEntity: AddTrackedEntityRequest
    ): Response<ImportSummaryResponse>

    @POST("trackedEntityInstances")
    suspend fun addMultipleTrackedEntityToInstance(
        @Body trackedEntity: AddTrackedEntityInstancesRequest
    ): Response<ImportSummaryResponse>

    @PUT("trackedEntityInstances/{trackedEntityInstanceID}")
    suspend fun updateTrackedEntityInInstance(
        @Path("trackedEntityInstanceID") trackedEntityInstanceId: String,
        @Body trackedEntity: AddTrackedEntityRequest
    ): Response<ImportSummaryResponse>

    @DELETE("trackedEntityInstances/{trackedEntityInstanceID}")
    suspend fun deleteTrackedEntityInstance(
        @Path("trackedEntityInstanceID") trackedEntityInstanceId: String
    ): Response<ImportSummaryResponse>

    @GET("trackedEntityAttributes/{id}/requiredValues")
    suspend fun getRequiredTrackedEntityAttributes(
        @Path("id") ownerUid: String
    ): Response<TrackedEntityRequiredAttributesResponse>

    /**ENROLLMENT MANAGEMENT**/
    @POST("enrollments")
    suspend fun enrollTrackedEntity(
        @Body enrollmentRequest: TrackedEntityEnrollmentRequest
    ): Response<ImportSummaryResponse>

    @PUT("enrollments/{enrollment_id}/cancelled")
    suspend fun cancelTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<ImportSummaryResponse>

    @PUT("enrollments/{enrollment_id}/completed")
    suspend fun completeTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<ImportSummaryResponse>

    @DELETE("enrollments/{enrollment_id}")
    suspend fun deleteTrackedEntityEnrollment(
        @Path("enrollment_id") enrollmentId: String
    ): Response<ImportSummaryResponse>

    @GET("enrollments")
    suspend fun getEnrollments(
        @Query("ou") organisationUnit: String,
        @Query("program") programID: String? = null,
    ): Response<EnrollmentResponse>

    /**EVENTS MANAGEMENT**/
    @GET("events")
    suspend fun getEventsList(
        @Query("orgUnit") organisationUnit: String,
        @Query("program") programID: String? = null,
    ): Response<EventsResponse>

    @GET("events/{event_id}")
    suspend fun getEventDetails(
        @Path("event_id") eventId : String
    ): Response<Event>

    @POST("events")
    suspend fun registerSingleEvent(
        @Body event: Event
    ): Response<ImportSummaryResponse>

    @POST("events")
    suspend fun registerMultipleEvents(
        @Body events: MultipleEventRegistrationRequest
    ): Response<ImportSummaryResponse>

    @PUT("events/{event_id}")
    suspend fun updateEvent(
        @Path("id") id: String,
        @Body event: Event
    ): Response<ImportSummaryResponse>

    @PUT("events/{event_id}")
    suspend fun deleteEvent(
        @Path("id") id: String
    ): Response<ImportSummaryResponse>

}