package com.wf.weatherforcastexample.modules;

import android.app.Application;
import com.wf.weatherforcastexample.domain.api.ApiGooglePlaces;
import com.wf.weatherforcastexample.ui.home.repo.HomeRepository;
import com.wf.weatherforcastexample.domain.api.ApiService;
import com.wf.weatherforcastexample.db.CityDao;
import com.wf.weatherforcastexample.db.ForecastCityDao;
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepository;
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepositoryImp;
import com.wf.weatherforcastexample.ui.home.data.LocationProvider;
import com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.wf.weatherforcastexample.widget.WidgetRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/wf/weatherforcastexample/modules/RepositoryModule;", "", "()V", "provideLocationProvider", "Lcom/wf/weatherforcastexample/ui/home/data/LocationProvider;", "context", "Landroid/app/Application;", "client", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "provideLocationProviderClient", "application", "providesDetailsRepository", "Lcom/wf/weatherforcastexample/ui/details/repo/DetailsRepository;", "detailsRepositoryImp", "Lcom/wf/weatherforcastexample/ui/details/repo/DetailsRepositoryImp;", "providesDetailsRepositoryImp", "apiService", "Lcom/wf/weatherforcastexample/domain/api/ApiService;", "forecastCityDao", "Lcom/wf/weatherforcastexample/db/ForecastCityDao;", "providesHomeRepository", "Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepository;", "homeRepositoryImp", "Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepositoryImp;", "locationProvider", "providesHomeRepositoryImp", "cityDao", "Lcom/wf/weatherforcastexample/db/CityDao;", "providesWidgetRepository", "Lcom/wf/weatherforcastexample/widget/WidgetRepository;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.wf.weatherforcastexample.modules.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.location.FusedLocationProviderClient provideLocationProviderClient(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.ui.home.data.LocationProvider provideLocationProvider(@org.jetbrains.annotations.NotNull()
    android.app.Application context, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.ui.home.repo.HomeRepository providesHomeRepository(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp homeRepositoryImp, @org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.home.data.LocationProvider locationProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp providesHomeRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.domain.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityDao cityDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.ui.details.repo.DetailsRepository providesDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.details.repo.DetailsRepositoryImp detailsRepositoryImp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.ui.details.repo.DetailsRepositoryImp providesDetailsRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.domain.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.ForecastCityDao forecastCityDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.widget.WidgetRepository providesWidgetRepository(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityDao cityDao) {
        return null;
    }
}