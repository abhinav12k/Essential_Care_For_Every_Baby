package com.example.eceb.api.interceptor

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by abhinav on 24/3/21.
 */
class BasicAuthInterceptor(username: String, password: String) : Interceptor{

    private var credentials = Credentials.basic(username,password)

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder().addHeader("Authorization",credentials)
            .build()
        return chain.proceed(request)
    }

}