package com.wf.weatherforcastexample.ui.home.repo

import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.domain.api.ApiGooglePlaces
import com.wf.weatherforcastexample.domain.api.ApiService
import com.wf.weatherforcastexample.domain.api.BaseDataSource
import com.wf.weatherforcastexample.db.CityDao
import com.wf.weatherforcastexample.db.CityModel

class HomeRepositoryImp(
    private val apiService: ApiService,
    private val  cityDao : CityDao
) : BaseDataSource() {

    // Retrofit Api
    suspend fun fetchWeatherForLocation(city:String) = getResult {
        apiService.getWeatherOfCity(city)
    }

    suspend fun getWeatherOfLatLon(latitude:String, longitude:String) = getResult {
        apiService.getWeatherOfLatLon(latitude, longitude)
    }


    // Local Room
    suspend fun insertCity(city: CityModel) = try {
        ResultData.Success(data = cityDao.insertCity(city))
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

    suspend fun getCities() = try {
        ResultData.Success(data = cityDao.getAllCities())
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

    suspend fun getSizeCities() = try {
        ResultData.Success(data = cityDao.getSizeCities())
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

    suspend fun deleteCity(id : Long) = try {
        ResultData.Success(data = cityDao.deleteCity(id))
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

    suspend fun deleteForecastCity(id : Long) = try {
        ResultData.Success(data = cityDao.deleteForecastCity(id))
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }




}