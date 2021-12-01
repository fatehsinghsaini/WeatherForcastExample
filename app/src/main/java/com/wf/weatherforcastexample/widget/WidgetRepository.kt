package com.wf.weatherforcastexample.widget

import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.db.CityDao
import javax.inject.Inject

class WidgetRepository @Inject constructor (private val  cityDao : CityDao) {

    suspend fun getCities() = try {
        ResultData.Success(data = cityDao.getAllCities())
    }catch (e : Exception){
        ResultData.Failure(msg = e.message.toString())
    }

}