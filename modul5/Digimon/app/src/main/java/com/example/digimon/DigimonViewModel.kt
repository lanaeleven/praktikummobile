package com.example.digimon


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.digimon.network.DigimonApi
import com.example.digimon.network.DigimonData
import kotlinx.coroutines.launch


class DigimonViewModel : ViewModel() {

    private val _angka = MutableLiveData<Int>(0)
    val angka: LiveData<Int> = _angka

    private val _data = MutableLiveData<String>("")
    val data: LiveData<String> = _data

    private val _digimonPhotos = MutableLiveData<List<DigimonData>>()
    val digimonPhotos: LiveData<List<DigimonData>> = _digimonPhotos

    private val _detailDigimon = MutableLiveData<DigimonData>()
    val detailDigimon: LiveData<DigimonData> = _detailDigimon

    init {
        getDigimonData()
    }


    fun setDetail(detail: DigimonData){
        _detailDigimon.value = detail
    }

    fun getDigimonData() {
        viewModelScope.launch {
            try {
                _digimonPhotos.value = DigimonApi.retrofitService.getData()
                _data.value = "Success: Mars properties retrieved"
            } catch (e: Exception){
                _data.value = "Failure: ${e.message}"
            }

        }
    }
}