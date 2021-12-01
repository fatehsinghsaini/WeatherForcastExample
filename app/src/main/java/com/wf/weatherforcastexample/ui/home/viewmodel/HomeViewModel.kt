package com.wf.weatherforcastexample.ui.home.viewmodel


import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.wf.weatherforcastexample.db.CityModel
import com.wf.weatherforcastexample.ui.home.repo.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {

    var isGpsEnabled = MutableLiveData<Boolean>()
    var isNetworkAvailable = MutableLiveData<Boolean>()
    var isPermissionGranted = MutableLiveData<Boolean>()

    fun setGpsStatus(value: Boolean) {
        isGpsEnabled.postValue(value)
    }

    fun setNetworkAvailable(value: Boolean) {
        isNetworkAvailable.postValue(value)
    }

    fun setPermissionGranted(value: Boolean) {
        isPermissionGranted.postValue(value)
    }


    val readyToFetch = MediatorLiveData<Map<String, Boolean>>().apply {
        addSource(isGpsEnabled) { gps ->
            value = isNetworkAvailable.value?.let { network ->
                isPermissionGranted.value?.let { permission ->
                    mapOf(
                        "permission" to permission,
                        "network" to network,
                        "gps" to gps
                    )
                }
            }
        }
        addSource(isNetworkAvailable) { network ->
            value = isGpsEnabled.value?.let { gps ->
                isPermissionGranted.value?.let { permission ->
                    mapOf(
                        "permission" to permission,
                        "network" to network,
                        "gps" to gps
                    )
                }
            }
        }
        addSource(isPermissionGranted) { permission ->
            value = isGpsEnabled.value?.let { gps ->
                isNetworkAvailable.value?.let { network ->
                    mapOf(
                        "permission" to permission,
                        "network" to network,
                        "gps" to gps
                    )
                }
            }
        }
    }


    fun fetchWeatherByCity(city: String) = homeRepository.fetchWeatherForLocation(city).asLiveData()

    fun fetchWeatherLatLong() = homeRepository.getWeatherOfLatLon().asLiveData()

    suspend fun insertCity(city: CityModel) = homeRepository.insertCity(city)

    suspend fun getCities() = homeRepository.getCities()

    suspend fun getSizeCities() = homeRepository.getSizeCities()

    suspend fun deleteCity(id: Long) = homeRepository.deleteCity(id)

    suspend fun deleteForecastCity(id: Long) = homeRepository.deleteForecastCity(id)


}