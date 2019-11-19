package com.pbt.clarke.fragapp.network

import com.pbt.clarke.fragapp.models.NasaImageData
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaService {

    @GET("apod")
    suspend fun getAPOD(@Query("api_key") key: String, @Query("date") date: String): NasaImageData

}