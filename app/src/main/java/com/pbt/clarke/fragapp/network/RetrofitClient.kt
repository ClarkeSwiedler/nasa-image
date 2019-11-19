package com.pbt.clarke.fragapp.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val webservice by lazy {
    Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/planetary/")
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build().create(NasaService::class.java)
}