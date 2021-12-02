package com.wf.weatherforcastexample.core.utils;

import com.wf.weatherforcastexample.BuildConfig;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/wf/weatherforcastexample/core/utils/AppConstants;", "", "()V", "BACK_PRESS_INTERVAL", "", "BASE_URL_RETROFIT_API", "", "CITY", "FASTEST_UPDATE_INTERVAL_SECS", "ID", "IS_FIRST", "LOCALE", "LOCATION_SETTINGS_REQUEST", "", "MULTIPLE_LOCATION_PERMISSION", "RELOAD_START", "REQUEST_TIME_OUT", "SPLASH_TIME_OUT", "UPDATE_INTERVAL_SECS", "WEATHER_API_IMAGE_ENDPOINT", "WEATHER_API_KEY", "WEATHER_API_QUERY", "WEATHER_UNIT", "WIDGET_REQUEST_CODE", "app_debug"})
public final class AppConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.wf.weatherforcastexample.core.utils.AppConstants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CITY = "city";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "id";
    public static final long REQUEST_TIME_OUT = 60L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER_UNIT = "metric";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER_API_IMAGE_ENDPOINT = "http://openweathermap.org/img/wn/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCALE = "LOCALE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_FIRST = "IS_FIRST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RELOAD_START = "RELOAD_START";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER_API_QUERY = "appid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL_RETROFIT_API = "http://api.openweathermap.org/data/2.5/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER_API_KEY = "1c0977973433bc2ad2806cf479f92c27";
    public static final int MULTIPLE_LOCATION_PERMISSION = 1;
    public static final int WIDGET_REQUEST_CODE = 0;
    public static final int LOCATION_SETTINGS_REQUEST = 1;
    public static final long BACK_PRESS_INTERVAL = 3000L;
    public static final long SPLASH_TIME_OUT = 4000L;
    public static final long UPDATE_INTERVAL_SECS = 10L;
    public static final long FASTEST_UPDATE_INTERVAL_SECS = 2L;
    
    private AppConstants() {
        super();
    }
}