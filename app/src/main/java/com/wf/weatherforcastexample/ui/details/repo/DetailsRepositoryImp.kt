package com.wf.weatherforcastexample.ui.details.repo

import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.db.ForecastCityDao
import com.wf.weatherforcastexample.db.ForecastCityModel
import com.wf.weatherforcastexample.domain.api.ApiService
import com.wf.weatherforcastexample.domain.api.BaseDataSource

class DetailsRepositoryImp(
    private val apiService: ApiService,
    private val forecastCityDao : ForecastCityDao
    ) : BaseDataSource() {

    // Retrofit Api
    suspend fun findCityForecastData(city:String) = getResult {
        apiService.findCityForecastData(city)
    }

    // Local Room

    suspend fun insertForecastCity(forecastCity: ForecastCityModel) = try {
        ResultData.Success(data = forecastCityDao.insertForecastCity(forecastCity))
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

    suspend fun getForecastCity(id : Long) = try {
        ResultData.Success(data = forecastCityDao.getForecastCity(id))
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }




}