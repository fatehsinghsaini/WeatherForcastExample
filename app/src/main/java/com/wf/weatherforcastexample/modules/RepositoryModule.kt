package com.wf.weatherforcastexample.modules

import android.app.Application
import com.wf.weatherforcastexample.ui.home.repo.HomeRepository
import com.wf.weatherforcastexample.domain.api.ApiService
import com.wf.weatherforcastexample.db.CityDao
import com.wf.weatherforcastexample.db.ForecastCityDao
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepository
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepositoryImp
import com.wf.weatherforcastexample.ui.home.data.LocationProvider
import com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.wf.weatherforcastexample.widget.WidgetRepository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {


    @Provides
    fun provideLocationProviderClient(application: Application): FusedLocationProviderClient {
        return LocationServices.getFusedLocationProviderClient(application.applicationContext)
    }

    @Provides
    fun provideLocationProvider(context: Application, client: FusedLocationProviderClient
    ): LocationProvider {
        return LocationProvider(context.applicationContext, client)
    }

    @Provides
    fun providesHomeRepository(homeRepositoryImp: HomeRepositoryImp, locationProvider: LocationProvider): HomeRepository {
        return HomeRepository(homeRepositoryImp , locationProvider)
    }

    @Provides
    fun providesHomeRepositoryImp(apiService: ApiService, cityDao : CityDao): HomeRepositoryImp {
        return HomeRepositoryImp(apiService , cityDao)
    }

    @Provides
    fun providesDetailsRepository(detailsRepositoryImp: DetailsRepositoryImp): DetailsRepository {
        return DetailsRepository(detailsRepositoryImp )
    }

    @Provides
    fun providesDetailsRepositoryImp(apiService: ApiService, forecastCityDao : ForecastCityDao): DetailsRepositoryImp {
        return DetailsRepositoryImp(apiService , forecastCityDao)
    }

    @Provides
    fun providesWidgetRepository(cityDao : CityDao): WidgetRepository {
        return WidgetRepository(cityDao)
    }





}