package com.wf.weatherforcastexample.ui.home.adapter;

import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.AsyncListDiffer;
import com.wf.weatherforcastexample.BR;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.base.adapter.BaseAdapter;
import com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder;
import com.wf.weatherforcastexample.core.base.adapter.CityInterface;
import com.wf.weatherforcastexample.core.base.adapter.DiffCallBack;
import com.wf.weatherforcastexample.databinding.ItemRvCityWeatherBinding;
import com.wf.weatherforcastexample.db.CityModel;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/adapter/ViewHolderCity;", "Lcom/wf/weatherforcastexample/core/base/adapter/BaseViewHolder;", "Lcom/wf/weatherforcastexample/db/CityModel;", "binding", "Lcom/wf/weatherforcastexample/databinding/ItemRvCityWeatherBinding;", "(Lcom/wf/weatherforcastexample/databinding/ItemRvCityWeatherBinding;)V", "itemRowBinding", "Landroidx/databinding/ViewDataBinding;", "getItemRowBinding", "()Landroidx/databinding/ViewDataBinding;", "setItemRowBinding", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "result", "app_debug"})
public final class ViewHolderCity extends com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder<com.wf.weatherforcastexample.db.CityModel> {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ViewDataBinding itemRowBinding;
    
    public ViewHolderCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.databinding.ItemRvCityWeatherBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.databinding.ViewDataBinding getItemRowBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setItemRowBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityModel result) {
    }
}