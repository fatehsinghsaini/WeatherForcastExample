package com.wf.weatherforcastexample.core.utils;

import android.content.SharedPreferences;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/wf/weatherforcastexample/core/utils/AppPreferences;", "", "mSharedPreferences", "Landroid/content/SharedPreferences;", "mSharedPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;)V", "getMSharedPreferences", "()Landroid/content/SharedPreferences;", "getMSharedPreferencesEditor", "()Landroid/content/SharedPreferences$Editor;", "clear", "", "getBooleanValue", "", "keyFlag", "", "defaultValue", "getIntValue", "", "key", "getLongValue", "", "getStringValue", "removeKey", "setValue", "value", "app_debug"})
public final class AppPreferences {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences mSharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences.Editor mSharedPreferencesEditor = null;
    
    @javax.inject.Inject()
    public AppPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences mSharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor mSharedPreferencesEditor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getMSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getMSharedPreferencesEditor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public final int getIntValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final long getLongValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    public final boolean getBooleanValue(@org.jetbrains.annotations.NotNull()
    java.lang.String keyFlag, boolean defaultValue) {
        return false;
    }
    
    public final void removeKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void clear() {
    }
}