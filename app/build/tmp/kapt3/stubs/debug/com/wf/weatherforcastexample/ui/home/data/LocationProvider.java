package com.wf.weatherforcastexample.ui.home.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import kotlinx.coroutines.flow.Flow;
import java.lang.Exception;
import java.util.*;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/data/LocationProvider;", "", "appContext", "Landroid/content/Context;", "client", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "(Landroid/content/Context;Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "fetchLocation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/wf/weatherforcastexample/ui/home/data/MapLocation;", "getDeviceCityName", "", "location", "app_debug"})
public final class LocationProvider {
    private final android.content.Context appContext = null;
    private final com.google.android.gms.location.FusedLocationProviderClient client = null;
    
    public LocationProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final kotlinx.coroutines.flow.Flow<com.wf.weatherforcastexample.ui.home.data.MapLocation> fetchLocation() {
        return null;
    }
    
    private final java.lang.String getDeviceCityName(com.wf.weatherforcastexample.ui.home.data.MapLocation location) {
        return null;
    }
}