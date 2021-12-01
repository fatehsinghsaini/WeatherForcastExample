package com.wf.weatherforcastexample;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.wf.weatherforcastexample.core.base.view.BaseActivity;
import com.wf.weatherforcastexample.databinding.ActivityMainBinding;
import com.wf.weatherforcastexample.ui.home.viewmodel.HomeViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.*;
import kotlin.properties.Delegates;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0017J\"\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J-\u0010\'\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140(2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\u001dJ\u0006\u0010-\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006."}, d2 = {"Lcom/wf/weatherforcastexample/MainActivityActivity;", "Lcom/wf/weatherforcastexample/core/base/view/BaseActivity;", "Lcom/wf/weatherforcastexample/databinding/ActivityMainBinding;", "layoutResourceId", "", "(I)V", "isDialogVisible", "", "getLayoutResourceId", "()I", "mViewModel", "Lcom/wf/weatherforcastexample/ui/home/viewmodel/HomeViewModel;", "getMViewModel", "()Lcom/wf/weatherforcastexample/ui/home/viewmodel/HomeViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "permissions", "Ljava/util/ArrayList;", "", "getPermissions", "()Ljava/util/ArrayList;", "hasLocationPermission", "isGPSActive", "isOnline", "context", "Landroid/content/Context;", "onActivityCreated", "", "dataBinder", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationPermission", "turnOnGPS", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivityActivity extends com.wf.weatherforcastexample.core.base.view.BaseActivity<com.wf.weatherforcastexample.databinding.ActivityMainBinding> {
    private final int layoutResourceId = 0;
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    private boolean isDialogVisible = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> permissions = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivityActivity() {
        super();
    }
    
    public MainActivityActivity(int layoutResourceId) {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wf.weatherforcastexample.ui.home.viewmodel.HomeViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPermissions() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.databinding.ActivityMainBinding dataBinder) {
    }
    
    public final boolean isOnline(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean isGPSActive() {
        return false;
    }
    
    public final void requestLocationPermission() {
    }
    
    public final boolean hasLocationPermission() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void turnOnGPS() {
    }
}