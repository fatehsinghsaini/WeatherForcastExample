package com.wf.weatherforcastexample.modules;

import android.content.Context;
import com.wf.weatherforcastexample.domain.api.ApiGooglePlaces;
import com.wf.weatherforcastexample.core.utils.AppPreferences;
import com.wf.weatherforcastexample.domain.api.ApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.readystatesoftware.chuck.ChuckInterceptor;
import com.wf.weatherforcastexample.BuildConfig;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\"\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/wf/weatherforcastexample/modules/NetworkModule;", "", "()V", "getDynamicRetrofitClient", "Lretrofit2/Retrofit;", "gson", "Lcom/google/gson/Gson;", "client", "Lokhttp3/OkHttpClient;", "baseUrl", "", "provideGson", "provideHeadersInterceptor", "Lokhttp3/Interceptor;", "appPreferences", "Lcom/wf/weatherforcastexample/core/utils/AppPreferences;", "context", "Landroid/content/Context;", "provideHomeGooglePlaces", "Lcom/wf/weatherforcastexample/domain/api/ApiGooglePlaces;", "okHttpClient", "provideHomeServices", "Lcom/wf/weatherforcastexample/domain/api/ApiService;", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "headersInterceptor", "logging", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.wf.weatherforcastexample.modules.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideHeadersInterceptor(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.core.utils.AppPreferences appPreferences, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor headersInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logging, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.domain.api.ApiService provideHomeServices(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.wf.weatherforcastexample.domain.api.ApiGooglePlaces provideHomeGooglePlaces(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    private final retrofit2.Retrofit getDynamicRetrofitClient(com.google.gson.Gson gson, okhttp3.OkHttpClient client, java.lang.String baseUrl) {
        return null;
    }
}