package com.wf.weatherforcastexample.ui.details.viewModel


import androidx.lifecycle.*
import com.wf.weatherforcastexample.db.ForecastCityModel
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val detailsRepository: DetailsRepository) :ViewModel() {


    fun findCityForecastData(city:String) = detailsRepository.findCityForecastData(city).asLiveData()

    suspend fun insertForecastCity(forecastCity: ForecastCityModel) = detailsRepository.insertForecastCity(forecastCity)

    suspend fun getForecastCity(id : Long) = detailsRepository.getForecastCity(id)

}