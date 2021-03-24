package com.example.eceb.api.service

import com.example.eceb.api.models.responses.LoginResponseData
import com.example.eceb.api.models.responses.PeriodResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by abhinav on 24/3/21.
 */
interface DHIS2_API {

    @GET("35/me")
    suspend fun loginUser(): Response<LoginResponseData>

    @GET("periodTypes")
    suspend fun getDateAndPeriodFormat(): Response<PeriodResponse>
}