package com.wf.weatherforcastexample.ui.splash.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wf.weatherforcastexample.MainActivityActivity;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.base.view.BaseFragment;
import com.wf.weatherforcastexample.databinding.FragmentSplashBinding;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/wf/weatherforcastexample/ui/splash/view/SplashFragment;", "Lcom/wf/weatherforcastexample/core/base/view/BaseFragment;", "Lcom/wf/weatherforcastexample/databinding/FragmentSplashBinding;", "layoutResourceLayout", "", "(I)V", "getLayoutResourceLayout", "()I", "param1", "", "param2", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentCreated", "dataBinder", "onResume", "setUpViewModelStateObservers", "showNoGps", "showNoInternet", "showTakePermissions", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashFragment extends com.wf.weatherforcastexample.core.base.view.BaseFragment<com.wf.weatherforcastexample.databinding.FragmentSplashBinding> {
    private final int layoutResourceLayout = 0;
    private java.lang.String param1;
    private java.lang.String param2;
    private java.util.HashMap _$_findViewCache;
    
    public SplashFragment() {
        super();
    }
    
    public SplashFragment(int layoutResourceLayout) {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutResourceLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onFragmentCreated(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.databinding.FragmentSplashBinding dataBinder) {
    }
    
    @java.lang.Override()
    public void setUpViewModelStateObservers() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * layout of No Internet
     */
    private final void showNoInternet() {
    }
    
    /**
     * layout of No Gps
     */
    private final void showNoGps() {
    }
    
    /**
     * layout of Take Permissions
     */
    private final void showTakePermissions() {
    }
}