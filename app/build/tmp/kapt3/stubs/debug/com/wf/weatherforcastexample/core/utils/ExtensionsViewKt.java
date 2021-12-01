package com.wf.weatherforcastexample.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r\u001a#\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0014\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n\u001a\u0012\u0010\u0017\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n\u001a\u0012\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\n\u001a\u0014\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\n\u001a\u0014\u0010\u001b\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\n\u001a\n\u0010\u001c\u001a\u00020\n*\u00020\u0001\u001a\n\u0010\u001d\u001a\u00020\n*\u00020\u0001\u001a\n\u0010\u001e\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u001f\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010 \u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010!\u001a\u00020\"*\u00020\u0002\u001a\n\u0010#\u001a\u00020\"*\u00020\u0002\u001a\n\u0010$\u001a\u00020\"*\u00020\u0002\u001a\n\u0010%\u001a\u00020&*\u00020\u0002\u001a0\u0010\'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\r2\b\b\u0002\u0010+\u001a\u00020\n\u001a\u0014\u0010,\u001a\u00020\u000f*\u00020-2\b\b\u0002\u0010.\u001a\u00020\"\u001a\n\u0010/\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u00100\u001a\u00020\u000f*\u00020\u00022\u0006\u00101\u001a\u00020\"\u001a\n\u00102\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u00103\u001a\u00020\u000f*\u00020\u00022\u0006\u00104\u001a\u000205\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u00066"}, d2 = {"ctx", "Landroid/content/Context;", "Landroid/view/View;", "getCtx", "(Landroid/view/View;)Landroid/content/Context;", "res", "Landroid/content/res/Resources;", "getRes", "(Landroid/view/View;)Landroid/content/res/Resources;", "adjustAlpha", "", "color", "factor", "", "hideViews", "", "views", "", "([Landroid/view/View;)V", "showViews", "changeBackgroundColor", "newColor", "duration", "changeBackgroundTint", "convertDpToPx", "dp", "fadeIn", "fadeOut", "getDisplayHeight", "getDisplayWidth", "hide", "hideSoftKeyboard", "inShow", "isGone", "", "isInvisible", "isVisible", "screenshot", "Landroid/graphics/Bitmap;", "setStrokedBackground", "backgroundColor", "strokeColor", "alpha", "strokeWidth", "setVerticalLayout", "Landroidx/recyclerview/widget/RecyclerView;", "aReverseLayout", "show", "showIf", "condition", "showSoftKeyboard", "snackBarError", "msg", "", "app_debug"})
public final class ExtensionsViewKt {
    
    public static final void snackBarError(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackBarError, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideSoftKeyboard) {
    }
    
    public static final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSoftKeyboard) {
    }
    
    public static final void changeBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$changeBackgroundColor, @androidx.annotation.ColorInt()
    int newColor, int duration) {
    }
    
    public static final void setVerticalLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setVerticalLayout, boolean aReverseLayout) {
    }
    
    /**
     * Create a Screnshot of the view and returns it as a Bitmap
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap screenshot(@org.jetbrains.annotations.NotNull()
    android.view.View $this$screenshot) {
        return null;
    }
    
    public static final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeIn, int duration) {
    }
    
    public static final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View $this$fadeOut, int duration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.res.Resources getRes(@org.jetbrains.annotations.NotNull()
    android.view.View $this$res) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Context getCtx(@org.jetbrains.annotations.NotNull()
    android.view.View $this$ctx) {
        return null;
    }
    
    public static final void showIf(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showIf, boolean condition) {
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    public static final void hide(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hide) {
    }
    
    public static final void inShow(@org.jetbrains.annotations.NotNull()
    android.view.View $this$inShow) {
    }
    
    public static final void showViews(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    public static final void hideViews(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    public static final boolean isVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isVisible) {
        return false;
    }
    
    public static final boolean isGone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isGone) {
        return false;
    }
    
    public static final boolean isInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isInvisible) {
        return false;
    }
    
    public static final void changeBackgroundTint(@org.jetbrains.annotations.NotNull()
    android.view.View $this$changeBackgroundTint, int color) {
    }
    
    public static final void setStrokedBackground(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setStrokedBackground, int backgroundColor, int strokeColor, float alpha, int strokeWidth) {
    }
    
    public static final int adjustAlpha(int color, float factor) {
        return 0;
    }
    
    public static final int getDisplayWidth(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDisplayWidth) {
        return 0;
    }
    
    public static final int getDisplayHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDisplayHeight) {
        return 0;
    }
    
    public static final int convertDpToPx(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$convertDpToPx, int dp) {
        return 0;
    }
}