package com.example.eceb.api

import com.example.eceb.api.interceptor.BasicAuthInterceptor
import com.example.eceb.api.service.DHIS2Api
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by abhinav on 24/3/21.
 */
object DHIS2Client {

    private const val BASE_URL = "https://play.dhis2.org/2.35.2/api/35/"

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())

    private val logging = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

    private val okHttpBuilder = OkHttpClient.Builder()
//        .readTimeout(5,TimeUnit.SECONDS)
//        .connectTimeout(5,TimeUnit.SECONDS)
        .addInterceptor(logging)
        .addInterceptor(BasicAuthInterceptor("admin","district"))

    val basicAuthApi: DHIS2Api = retrofitBuilder
        .client(okHttpBuilder.build())
        .build()
        .create(DHIS2Api::class.java)

}