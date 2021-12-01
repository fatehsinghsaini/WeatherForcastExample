package com.wf.weatherforcastexample.core.utils;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.*;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.RequiresPermission;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/wf/weatherforcastexample/core/utils/Extensions;", "", "androidApplication", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getNetworkInfo", "Landroid/net/NetworkInfo;", "isConnected", "", "openWifi", "", "app_debug"})
public final class Extensions {
    private final android.app.Application androidApplication = null;
    
    @javax.inject.Inject()
    public Extensions(@org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication) {
        super();
    }
    
    /**
     * Handler time 1000 millisecond ==> 1Second
     * throws  ActivityNotFoundException
     */
    public final void openWifi() {
    }
    
    /**
     * Get the network info
     *
     * @param context the context
     * @return network info
     */
    @androidx.annotation.RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
    private final android.net.NetworkInfo getNetworkInfo(android.app.Application androidApplication) {
        return null;
    }
    
    /**
     * Check if there is any connectivity
     *
     * @param context the context
     * @return boolean boolean
     */
    @androidx.annotation.RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
    public final boolean isConnected() {
        return false;
    }
}