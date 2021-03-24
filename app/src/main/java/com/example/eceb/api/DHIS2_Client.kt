package com.example.eceb.api

import com.example.eceb.api.interceptor.BasicAuthInterceptor
import com.example.eceb.api.service.DHIS2_API
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by abhinav on 24/3/21.
 */
object DHIS2_Client {

    private const val BASE_URL = "https://play.dhis2.org/2.35.2/api/"

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())

    private val okHttpBuilder = OkHttpClient.Builder()
        .readTimeout(5,TimeUnit.SECONDS)
        .connectTimeout(2,TimeUnit.SECONDS)
        .addInterceptor(BasicAuthInterceptor("abhinav","Abhinav@1234"))

    val basicAuthApi = retrofitBuilder
        .client(okHttpBuilder.build())
        .build()
        .create(DHIS2_API::class.java)

}