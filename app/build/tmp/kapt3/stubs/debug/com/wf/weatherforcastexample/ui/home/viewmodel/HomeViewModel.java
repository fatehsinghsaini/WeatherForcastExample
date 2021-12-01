package com.wf.weatherforcastexample.ui.home.viewmodel;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.wf.weatherforcastexample.db.CityModel;
import com.wf.weatherforcastexample.ui.home.repo.HomeRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u001d2\u0006\u0010\u001f\u001a\u00020\u0012J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u001dJ\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001f\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepository;", "(Lcom/wf/weatherforcastexample/ui/home/repo/HomeRepository;)V", "isGpsEnabled", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "setGpsEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "isNetworkAvailable", "setNetworkAvailable", "isPermissionGranted", "setPermissionGranted", "readyToFetch", "Landroidx/lifecycle/MediatorLiveData;", "", "", "getReadyToFetch", "()Landroidx/lifecycle/MediatorLiveData;", "deleteCity", "Lcom/wf/weatherforcastexample/data/ResultData;", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForecastCity", "fetchWeatherByCity", "Landroidx/lifecycle/LiveData;", "Lcom/wf/weatherforcastexample/domain/model/WeatherCityResponse;", "city", "fetchWeatherLatLong", "getCities", "", "Lcom/wf/weatherforcastexample/db/CityModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSizeCities", "insertCity", "(Lcom/wf/weatherforcastexample/db/CityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGpsStatus", "value", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.wf.weatherforcastexample.ui.home.repo.HomeRepository homeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isGpsEnabled;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNetworkAvailable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPermissionGranted;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.Map<java.lang.String, java.lang.Boolean>> readyToFetch = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.home.repo.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isGpsEnabled() {
        return null;
    }
    
    public final void setGpsEnabled(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNetworkAvailable() {
        return null;
    }
    
    public final void setNetworkAvailable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPermissionGranted() {
        return null;
    }
    
    public final void setPermissionGranted(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void setGpsStatus(boolean value) {
    }
    
    public final void setNetworkAvailable(boolean value) {
    }
    
    public final void setPermissionGranted(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.Map<java.lang.String, java.lang.Boolean>> getReadyToFetch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.WeatherCityResponse>> fetchWeatherByCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.WeatherCityResponse>> fetchWeatherLatLong() {
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