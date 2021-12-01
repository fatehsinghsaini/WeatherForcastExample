package com.wf.weatherforcastexample.ui.details.repo;

import com.wf.weatherforcastexample.data.ResultData;
import com.wf.weatherforcastexample.db.ForecastCityDao;
import com.wf.weatherforcastexample.db.ForecastCityModel;
import com.wf.weatherforcastexample.domain.api.ApiService;
import com.wf.weatherforcastexample.domain.api.BaseDataSource;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/wf/weatherforcastexample/ui/details/repo/DetailsRepositoryImp;", "Lcom/wf/weatherforcastexample/domain/api/BaseDataSource;", "apiService", "Lcom/wf/weatherforcastexample/domain/api/ApiService;", "forecastCityDao", "Lcom/wf/weatherforcastexample/db/ForecastCityDao;", "(Lcom/wf/weatherforcastexample/domain/api/ApiService;Lcom/wf/weatherforcastexample/db/ForecastCityDao;)V", "findCityForecastData", "Lcom/wf/weatherforcastexample/data/ResultData;", "Lcom/wf/weatherforcastexample/domain/model/forecest/ForecastCityResponse;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastCity", "Lcom/wf/weatherforcastexample/db/ForecastCityModel;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertForecastCity", "forecastCity", "(Lcom/wf/weatherforcastexample/db/ForecastCityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailsRepositoryImp extends com.wf.weatherforcastexample.domain.api.BaseDataSource {
    private final com.wf.weatherforcastexample.domain.api.ApiService apiService = null;
    private final com.wf.weatherforcastexample.db.ForecastCityDao forecastCityDao = null;
    
    public DetailsRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.domain.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.ForecastCityDao forecastCityDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findCityForecastData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertForecastCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.ForecastCityModel forecastCity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.lang.Long>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.db.ForecastCityModel>> continuation) {
        return null;
    }
}