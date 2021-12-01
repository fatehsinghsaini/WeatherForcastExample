package com.wf.weatherforcastexample.core.base.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.wf.weatherforcastexample.core.utils.AppPreferences;
import com.wf.weatherforcastexample.core.utils.Extensions;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\'\u001a\u00020(H\u0004J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0015\u00101\u001a\u00020(2\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fJ\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020(H\u0016J\u001a\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00106\u001a\u00020(H&R\u001e\u0010\u0005\u001a\u00020\u00068\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00128\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00067"}, d2 = {"Lcom/wf/weatherforcastexample/core/base/view/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "appPreferences", "Lcom/wf/weatherforcastexample/core/utils/AppPreferences;", "getAppPreferences", "()Lcom/wf/weatherforcastexample/core/utils/AppPreferences;", "setAppPreferences", "(Lcom/wf/weatherforcastexample/core/utils/AppPreferences;)V", "dataBinder", "getDataBinder", "()Landroidx/databinding/ViewDataBinding;", "setDataBinder", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "extensions", "Lcom/wf/weatherforcastexample/core/utils/Extensions;", "getExtensions", "()Lcom/wf/weatherforcastexample/core/utils/Extensions;", "setExtensions", "(Lcom/wf/weatherforcastexample/core/utils/Extensions;)V", "layoutResourceLayout", "", "getLayoutResourceLayout", "()I", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "backFragment", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentCreated", "onPause", "onResume", "onViewCreated", "view", "setUpViewModelStateObservers", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    protected androidx.navigation.NavController navController;
    protected T dataBinder;
    protected android.view.View rootView;
    @javax.inject.Inject()
    protected com.wf.weatherforcastexample.core.utils.Extensions extensions;
    @javax.inject.Inject()
    protected com.wf.weatherforcastexample.core.utils.AppPreferences appPreferences;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutResourceLayout();
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    protected final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getDataBinder() {
        return null;
    }
    
    protected final void setDataBinder(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.view.View getRootView() {
        return null;
    }
    
    protected final void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.wf.weatherforcastexample.core.utils.Extensions getExtensions() {
        return null;
    }
    
    protected final void setExtensions(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.core.utils.Extensions p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.wf.weatherforcastexample.core.utils.AppPreferences getAppPreferences() {
        return null;
    }
    
    protected final void setAppPreferences(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.core.utils.AppPreferences p0) {
    }
    
    public abstract void onFragmentCreated(@org.jetbrains.annotations.NotNull()
    T dataBinder);
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void setUpViewModelStateObservers();
    
    protected final void backFragment() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}