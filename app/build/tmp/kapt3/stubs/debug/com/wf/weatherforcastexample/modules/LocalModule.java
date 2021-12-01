package com.wf.weatherforcastexample.modules;

import android.content.Context;
import androidx.room.Room;
import com.wf.weatherforcastexample.db.CityDao;
import com.wf.weatherforcastexample.db.CityDatabase;
import com.wf.weatherforcastexample.db.ForecastCityDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/wf/weatherforcastexample/modules/LocalModule;", "", "()V", "cityDao", "Lcom/wf/weatherforcastexample/db/CityDao;", "database", "Lcom/wf/weatherforcastexample/db/CityDatabase;", "forecastCityDao", "Lcom/wf/weatherforcastexample/db/ForecastCityDao;", "provideDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class LocalModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.wf.weatherforcastexample.modules.LocalModule INSTANCE = null;
    
    private LocalModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.wf.weatherforcastexample.db.CityDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.wf.weatherforcastexample.db.CityDao cityDao(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.wf.weatherforcastexample.db.ForecastCityDao forecastCityDao(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityDatabase database) {
        return null;
    }
}