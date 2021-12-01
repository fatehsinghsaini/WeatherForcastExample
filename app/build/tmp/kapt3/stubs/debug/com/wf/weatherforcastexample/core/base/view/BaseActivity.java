package com.wf.weatherforcastexample.core.base.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0014\u0010\u0005\u001a\u00020\u00068eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/wf/weatherforcastexample/core/base/view/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layoutResourceId", "", "getLayoutResourceId", "()I", "initial", "", "onActivityCreated", "dataBinder", "(Landroidx/databinding/ViewDataBinding;)V", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutResourceId();
    
    public abstract void onActivityCreated(@org.jetbrains.annotations.NotNull()
    T dataBinder);
    
    @java.lang.Override()
    public final void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    android.os.PersistableBundle persistentState) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initial() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}