package com.example.eceb

import com.example.eceb.api.DHIS2Client
import com.example.eceb.api.models.entities.Attribute
import com.example.eceb.api.models.requests.AddTrackedEntityInstancesRequest
import com.example.eceb.api.models.requests.AddTrackedEntityRequest
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.Test

class ApiUnitTest {

    /**THESE ALL TESTS ARE DONE WITH THE TESTING SERVER WITH TESTING CREDENTIALS**/

    @Test
    fun test_userLogin() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.loginUser()
            assertThat(response.body()?.userCredentials?.username).isEqualTo("abhinav")
        }
    }

    @Test
    fun test_periodTypes() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.getDateAndPeriodFormat()
            assertThat(response.body()?.periodTypes?.size).isAtLeast(1)
        }
    }

    @Test
    fun test_getDataElements() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.getDataElements(
                null,
                null,
                null,
                null
            )
            assertThat(response.body()?.dataElements?.size).isAtLeast(1)
        }
    }

    @Test
    fun test_getDataSets() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.getDataSets("BfMAe6Itzgt")
            assertThat(response.body()?.name).isEqualTo("Child Health")
            assertThat(response.body()?.id).isEqualTo("BfMAe6Itzgt")
        }
    }

    @Test
    fun test_getTrackedEntityInstances() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.getTrackedEntityInstances("ImspTQPwCqd")
            assertThat(response.body()?.trackedEntityInstances?.get(0)?.orgUnit).isEqualTo("ImspTQPwCqd")
        }
    }

    @Test
    fun test_addTrackedEntityToInstance() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.addTrackedEntityToInstance(
                AddTrackedEntityRequest(
                    listOf(
                        Attribute("w75KJ2mc4zz", value = "Joe"),
                        Attribute("zDhUuAYrxNC", value = "Smith")
                    ),
                    orgUnit = "DiszpKrYNg8",
                    trackedEntity = "KvbzudNVUVx"
                )
            )
            //Likely to produce errorBody due to conflict
            assertThat(response.code()).isEqualTo(409)

        }
    }

    @Test
    fun test_addMultipleTrackedEntityToInstance() {
        runBlocking {
            val response = DHIS2Client.basicAuthApi.addMultipleTrackedEntityToInstance(
                AddTrackedEntityInstancesRequest(
                    listOf(
                        AddTrackedEntityRequest(
                            listOf(
                                Attribute("w75KJ2mc4zz", value = "Joe"),
                                Attribute("zDhUuAYrxNC", value = "Smith")
                            ),
                            orgUnit = "DiszpKrYNg8",
                            trackedEntity = "KvbzudNVUVx"
                        )
                    )
                )
            )
            //Likely to produce errorBody due to conflict
            assertThat(response.code()).isEqualTo(409)
        }
    }

    @Test
    fun test_updateTrackedEntityInstance(){
        runBlocking {
            val response = DHIS2Client.basicAuthApi.updateTrackedEntityInInstance(
                "nEenWmSyUEp",
                AddTrackedEntityRequest(
                    listOf(
                        Attribute("w75KJ2mc4zz", value = "Joe"),
                        Attribute("zDhUuAYrxNC", value = "Smith")
                    ),
                    orgUnit = "DiszpKrYNg8",
                    trackedEntity = "AHgGHO6ZH9b"
                )
            )
            //Likely to produce errorBody due to conflict
            assertThat(response.code()).isEqualTo(409)
        }
    }

    @Test
    fun test_deleteTrackedEntityInstance(){
        runBlocking {
            val response = DHIS2Client.basicAuthApi.deleteTrackedEntityInstance(
                "KvbzudNVUVx"
            )
            assertThat(response.body()?.httpStatusCode).isEqualTo(200)
        }
    }

    @Test
    fun test_requiredTrackedEntityAttributes(){
        runBlocking {
            val response = DHIS2Client.basicAuthApi.getRequiredTrackedEntityAttributes("KvbzudNVUVx")
            //Checking not found response code
            assertThat(response.code()).isEqualTo(404)
        }
    }



}