package com.wf.weatherforcastexample.ui.home.repo

import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.db.CityModel
import com.wf.weatherforcastexample.domain.model.WeatherCityResponse
import com.wf.weatherforcastexample.ui.home.data.LocationProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow


class HomeRepository(
    private val homeRepositoryImp: HomeRepositoryImp,
    private val useCase: LocationProvider,
) {

    // Retrofit Api
    fun fetchWeatherForLocation(city: String): Flow<ResultData<WeatherCityResponse>> = flow {
        emit(homeRepositoryImp.fetchWeatherForLocation(city))
    }

    fun getWeatherOfLatLon(): Flow<ResultData<WeatherCityResponse>> = flow {
        useCase.fetchLocation().collect { deviceLocation ->
            emit(
                homeRepositoryImp.getWeatherOfLatLon(
                    deviceLocation.latitude.toString(),
                    deviceLocation.longitude.toString()
                )
            )
        }
    }

    // Local storage
    suspend fun insertCity(city: CityModel) = homeRepositoryImp.insertCity(city)

    suspend fun getCities() = homeRepositoryImp.getCities()

    suspend fun getSizeCities() = homeRepositoryImp.getSizeCities()

    suspend fun deleteCity(id: Long) = homeRepositoryImp.deleteCity(id)

    suspend fun deleteForecastCity(id: Long) = homeRepositoryImp.deleteForecastCity(id)


}