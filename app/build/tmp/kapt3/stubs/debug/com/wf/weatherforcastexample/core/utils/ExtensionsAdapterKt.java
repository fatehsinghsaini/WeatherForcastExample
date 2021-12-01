package com.wf.weatherforcastexample.core.utils;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import coil.transform.RoundedCornersTransformation;
import com.wf.weatherforcastexample.R;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001f\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"setBindImage", "", "image", "Landroid/widget/ImageView;", "imageUrl", "", "setBindString", "textView", "Landroid/widget/TextView;", "txtString", "setBindTemp", "Temp", "", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "app_debug"})
public final class ExtensionsAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:bindString"})
    public static final void setBindString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String txtString) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:bindTemp"})
    public static final void setBindTemp(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.Double Temp) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:bindImgUrl"})
    public static final void setBindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView image, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
}