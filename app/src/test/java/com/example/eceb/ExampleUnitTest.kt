package com.example.eceb

import com.example.eceb.api.DHIS2_Client
import com.example.eceb.api.models.entities.LoginData
import com.example.eceb.api.models.entities.UserCredentials
import com.example.eceb.api.models.requests.LoginRequest
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_userLogin(){
        runBlocking {
            val response = DHIS2_Client.basicAuthApi.loginUser()
            assertEquals("abhinav",response.body()?.userCredentials?.username)
        }
    }

}