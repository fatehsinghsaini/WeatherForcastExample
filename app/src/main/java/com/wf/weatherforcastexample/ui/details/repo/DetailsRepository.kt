package com.wf.weatherforcastexample.ui.details.repo

import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.db.ForecastCityModel
import com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class DetailsRepository(
    private val detailsRepositoryImp: DetailsRepositoryImp
) {

    // Retrofit Api
    fun findCityForecastData(city: String): Flow<ResultData<ForecastCityResponse>> = flow {
        emit(detailsRepositoryImp.findCityForecastData(city))
    }

    // Local

    suspend fun insertForecastCity(forecastCity: ForecastCityModel) = detailsRepositoryImp.insertForecastCity(forecastCity)

    suspend fun getForecastCity(id : Long) = detailsRepositoryImp.getForecastCity(id)


}