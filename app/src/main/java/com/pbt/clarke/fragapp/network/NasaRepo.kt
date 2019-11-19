package com.pbt.clarke.fragapp.network

class NasaRepo {
    private var client: NasaService = webservice

    suspend fun getNasaImage(date: String) = client.getAPOD("DEMO_KEY", date)
}