package com.wf.weatherforcastexample.domain.model;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJF\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/wf/weatherforcastexample/domain/model/WeatherCityResponse;", "", "main", "Lcom/wf/weatherforcastexample/domain/model/Main;", "weather", "", "Lcom/wf/weatherforcastexample/domain/model/WeatherItem;", "name", "", "id", "", "(Lcom/wf/weatherforcastexample/domain/model/Main;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMain", "()Lcom/wf/weatherforcastexample/domain/model/Main;", "getName", "()Ljava/lang/String;", "getWeather", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Lcom/wf/weatherforcastexample/domain/model/Main;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wf/weatherforcastexample/domain/model/WeatherCityResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherCityResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.wf.weatherforcastexample.domain.model.Main main = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.wf.weatherforcastexample.domain.model.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wf.weatherforcastexample.domain.model.WeatherCityResponse copy(@org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    java.util.List<com.wf.weatherforcastexample.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherCityResponse() {
        super();
    }
    
    public WeatherCityResponse(@org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.Main main, @org.jetbrains.annotations.Nullable()
    java.util.List<com.wf.weatherforcastexample.domain.model.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.Main component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.wf.weatherforcastexample.domain.model.WeatherItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.wf.weatherforcastexample.domain.model.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
}