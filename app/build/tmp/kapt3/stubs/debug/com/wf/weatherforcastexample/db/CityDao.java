package com.wf.weatherforcastexample.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/wf/weatherforcastexample/db/CityDao;", "", "deleteAllCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCity", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForecastCity", "getAllCities", "", "Lcom/wf/weatherforcastexample/db/CityModel;", "getSizeCities", "insertCity", "jobs", "(Lcom/wf/weatherforcastexample/db/CityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CityDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityModel jobs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from city_table ")
    public abstract java.lang.Object getAllCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.wf.weatherforcastexample.db.CityModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select COUNT(*) FROM city_table")
    public abstract java.lang.Object getSizeCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from city_table")
    public abstract java.lang.Object deleteAllCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from city_table where id =:id")
    public abstract java.lang.Object deleteCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from forecast_city_table where id =:id")
    public abstract java.lang.Object deleteForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}