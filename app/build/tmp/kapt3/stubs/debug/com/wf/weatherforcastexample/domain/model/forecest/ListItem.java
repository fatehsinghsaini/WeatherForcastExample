package com.wf.weatherforcastexample.domain.model.forecest;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u008e\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\'\u0010\u001aR \u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006="}, d2 = {"Lcom/wf/weatherforcastexample/domain/model/forecest/ListItem;", "", "dt", "", "pop", "", "visibility", "dtTxt", "", "weather", "", "Lcom/wf/weatherforcastexample/domain/model/forecest/WeatherItem;", "main", "Lcom/wf/weatherforcastexample/domain/model/forecest/Main;", "clouds", "Lcom/wf/weatherforcastexample/domain/model/forecest/Clouds;", "sys", "Lcom/wf/weatherforcastexample/domain/model/forecest/Sys;", "wind", "Lcom/wf/weatherforcastexample/domain/model/forecest/Wind;", "rain", "Lcom/wf/weatherforcastexample/domain/model/forecest/Rain;", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/wf/weatherforcastexample/domain/model/forecest/Main;Lcom/wf/weatherforcastexample/domain/model/forecest/Clouds;Lcom/wf/weatherforcastexample/domain/model/forecest/Sys;Lcom/wf/weatherforcastexample/domain/model/forecest/Wind;Lcom/wf/weatherforcastexample/domain/model/forecest/Rain;)V", "getClouds", "()Lcom/wf/weatherforcastexample/domain/model/forecest/Clouds;", "getDt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/wf/weatherforcastexample/domain/model/forecest/Main;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/wf/weatherforcastexample/domain/model/forecest/Rain;", "getSys", "()Lcom/wf/weatherforcastexample/domain/model/forecest/Sys;", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/wf/weatherforcastexample/domain/model/forecest/Wind;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/wf/weatherforcastexample/domain/model/forecest/Main;Lcom/wf/weatherforcastexample/domain/model/forecest/Clouds;Lcom/wf/weatherforcastexample/domain/model/forecest/Sys;Lcom/wf/weatherforcastexample/domain/model/forecest/Wind;Lcom/wf/weatherforcastexample/domain/model/forecest/Rain;)Lcom/wf/weatherforcastexample/domain/model/forecest/ListItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ListItem {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final java.lang.Integer dt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pop")
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.wf.weatherforcastexample.domain.model.forecest.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.wf.weatherforcastexample.domain.model.forecest.Main main = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final com.wf.weatherforcastexample.domain.model.forecest.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.wf.weatherforcastexample.domain.model.forecest.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.wf.weatherforcastexample.domain.model.forecest.Wind wind = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rain")
    private final com.wf.weatherforcastexample.domain.model.forecest.Rain rain = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wf.weatherforcastexample.domain.model.forecest.ListItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.wf.weatherforcastexample.domain.model.forecest.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Main main, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Clouds clouds, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Sys sys, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Wind wind, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Rain rain) {
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
    
    public ListItem() {
        super();
    }
    
    public ListItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.wf.weatherforcastexample.domain.model.forecest.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Main main, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Clouds clouds, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Sys sys, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Wind wind, @org.jetbrains.annotations.Nullable()
    com.wf.weatherforcastexample.domain.model.forecest.Rain rain) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.wf.weatherforcastexample.domain.model.forecest.WeatherItem> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.wf.weatherforcastexample.domain.model.forecest.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Main component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Clouds component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Sys component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Wind component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Rain component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wf.weatherforcastexample.domain.model.forecest.Rain getRain() {
        return null;
    }
}