package com.wf.weatherforcastexample.modules;

import android.content.Context;
import android.content.SharedPreferences;
import com.wf.weatherforcastexample.BaseApp;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.utils.AppPreferences;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/wf/weatherforcastexample/modules/AppPreferencesModule;", "", "()V", "providesApplication", "Lcom/wf/weatherforcastexample/BaseApp;", "app", "Landroid/content/Context;", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "context", "providesSharedPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "mSharedPreferences", "providesSharedPreferencesHelper", "Lcom/wf/weatherforcastexample/core/utils/AppPreferences;", "sharedPreferences", "sharedPreferencesEditor", "app_debug"})
@dagger.Module()
public final class AppPreferencesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.wf.weatherforcastexample.modules.AppPreferencesModule INSTANCE = null;
    
    private AppPreferencesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.wf.weatherforcastexample.BaseApp providesApplication(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences providesSharedPreferences(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences.Editor providesSharedPreferencesEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences mSharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.wf.weatherforcastexample.core.utils.AppPreferences providesSharedPreferencesHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor sharedPreferencesEditor) {
        return null;
    }
}