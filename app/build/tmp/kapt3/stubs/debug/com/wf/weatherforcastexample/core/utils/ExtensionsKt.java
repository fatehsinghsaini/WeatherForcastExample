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

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\n\u0010\f\u001a\u00020\u0006*\u00020\r\u001a\u0011\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u000e\u00a2\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u001a(\u0010\u0010\u001a\u00020\u0011*\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\u0018\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u0018\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020 2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u00a8\u0006\""}, d2 = {"runDelayed", "", "delayMillis", "", "action", "Lkotlin/Function0;", "", "runDelayedOnUiThread", "setLogCat", "tag", "", "msg", "hideSoftKeyboard", "Landroid/app/Activity;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Lkotlin/Unit;", "launchActivity", "Landroid/content/Intent;", "cls", "Ljava/lang/Class;", "tagString", "message", "setSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "takeFocus", "view", "Landroid/view/View;", "toast", "stringRes", "", "duration", "text", "Landroid/app/Application;", "Landroid/content/Context;", "app_debug"})
public final class ExtensionsKt {
    
    public static final boolean runDelayed(long delayMillis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return false;
    }
    
    public static final boolean runDelayedOnUiThread(long delayMillis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return false;
    }
    
    /**
     * Push Message LENGTH SHORT
     *
     * @param context the context = getAppInstance().applicationContext
     * @param msg the Message
     * Set Message
     */
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Application $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    public static final void setLogCat(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar setSnackBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setSnackBar, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar setSnackBar(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$setSnackBar, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideSoftKeyboard) {
        return null;
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideSoftKeyboard) {
    }
    
    public static final void takeFocus(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$takeFocus, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void takeFocus(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$takeFocus, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent launchActivity(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$launchActivity, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> cls) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent launchActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$launchActivity, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> cls) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent launchActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$launchActivity, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> cls, @org.jetbrains.annotations.NotNull()
    java.lang.String tagString, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
}