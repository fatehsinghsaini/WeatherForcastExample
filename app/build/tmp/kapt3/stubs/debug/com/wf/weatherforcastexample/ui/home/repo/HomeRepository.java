package com.wf.weatherforcastexample.ui.home.repo;

import com.wf.weatherforcastexample.data.ResultData;
import com.wf.weatherforcastexample.db.CityModel;
import com.wf.weatherforcastexample.domain.model.WeatherCityResponse;
import com.wf.weatherforcastexample.ui.home.data.LocationProvider;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u000fJ\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0011\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepository;", "", "homeRepositoryImp", "Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepositoryImp;", "useCase", "Lcom/wf/weatherforcastexample/ui/home/data/LocationProvider;", "(Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepositoryImp;Lcom/wf/weatherforcastexample/ui/home/data/LocationProvider;)V", "deleteCity", "Lcom/wf/weatherforcastexample/data/ResultData;", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForecastCity", "fetchWeatherForLocation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/wf/weatherforcastexample/domain/model/WeatherCityResponse;", "city", "", "getCities", "", "Lcom/wf/weatherforcastexample/db/CityModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSizeCities", "getWeatherOfLatLon", "insertCity", "(Lcom/wf/weatherforcastexample/db/CityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class HomeRepository {
    private final com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp homeRepositoryImp = null;
    private final com.wf.weatherforcastexample.ui.home.data.LocationProvider useCase = null;
    
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.home.repo.HomeRepositoryImp homeRepositoryImp, @org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.home.data.LocationProvider useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.WeatherCityResponse>> fetchWeatherForLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.WeatherCityResponse>> getWeatherOfLatLon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityModel city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.lang.Long>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.util.List<com.wf.weatherforcastexample.db.CityModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSizeCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.lang.Long>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<kotlin.Unit>> continuation) {
        return null;
    }
}