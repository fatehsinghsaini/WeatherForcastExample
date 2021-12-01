package com.wf.weatherforcastexample.db;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/wf/weatherforcastexample/db/Converters;", "", "()V", "getIntModel", "", "Lcom/wf/weatherforcastexample/db/ForecastRow;", "jsonModel", "", "setIntModel", "ints", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String setIntModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.wf.weatherforcastexample.db.ForecastRow> ints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.wf.weatherforcastexample.db.ForecastRow> getIntModel(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonModel) {
        return null;
    }
}