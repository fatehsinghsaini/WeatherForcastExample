package com.wf.weatherforcastexample.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/wf/weatherforcastexample/db/ForecastCityDao;", "", "deleteAllForecastCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForecastCity", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastCity", "Lcom/wf/weatherforcastexample/db/ForecastCityModel;", "getSizeForecastCities", "insertForecastCity", "forecastCity", "(Lcom/wf/weatherforcastexample/db/ForecastCityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ForecastCityDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertForecastCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.ForecastCityModel forecastCity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from forecast_city_table where id =:id")
    public abstract java.lang.Object getForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.db.ForecastCityModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select COUNT(*) FROM forecast_city_table")
    public abstract java.lang.Object getSizeForecastCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from forecast_city_table")
    public abstract java.lang.Object deleteAllForecastCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from forecast_city_table where id =:id")
    public abstract java.lang.Object deleteForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}