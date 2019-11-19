package com.pbt.clarke.fragapp.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.pbt.clarke.fragapp.network.NasaRepo
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {
    private val repository = NasaRepo()

    val nasaImage = liveData(Dispatchers.IO) {
        val retrievedImage = repository.getNasaImage("2012-12-12")
        emit(retrievedImage)
    }
}
