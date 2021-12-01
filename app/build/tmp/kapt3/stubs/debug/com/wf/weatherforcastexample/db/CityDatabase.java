package com.wf.weatherforcastexample.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {com.wf.weatherforcastexample.db.CityModel.class, com.wf.weatherforcastexample.db.ForecastCityModel.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/wf/weatherforcastexample/db/CityDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cityDao", "Lcom/wf/weatherforcastexample/db/CityDao;", "forecastCityDao", "Lcom/wf/weatherforcastexample/db/ForecastCityDao;", "app_debug"})
public abstract class CityDatabase extends androidx.room.RoomDatabase {
    
    public CityDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.wf.weatherforcastexample.db.CityDao cityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.wf.weatherforcastexample.db.ForecastCityDao forecastCityDao();
}