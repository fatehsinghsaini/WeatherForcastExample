package com.wf.weatherforcastexample.ui.home.adapter;

import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.AsyncListDiffer;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.base.adapter.BaseAdapter;
import com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder;
import com.wf.weatherforcastexample.core.base.adapter.CityInterface;
import com.wf.weatherforcastexample.core.base.adapter.DiffCallBack;
import com.wf.weatherforcastexample.databinding.ItemRvCityWeatherBinding;
import com.wf.weatherforcastexample.db.CityModel;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005J\u001e\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/adapter/CityAdapter;", "Lcom/wf/weatherforcastexample/core/base/adapter/BaseAdapter;", "Lcom/wf/weatherforcastexample/db/CityModel;", "()V", "interfaceCity", "Lcom/wf/weatherforcastexample/core/base/adapter/CityInterface;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "addDataList", "", "dataList", "", "clearDataList", "getItemCount", "", "interfaceInit", "onBindViewHolder", "holder", "Lcom/wf/weatherforcastexample/core/base/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataList", "app_debug"})
public final class CityAdapter extends com.wf.weatherforcastexample.core.base.adapter.BaseAdapter<com.wf.weatherforcastexample.db.CityModel> {
    private androidx.recyclerview.widget.AsyncListDiffer<com.wf.weatherforcastexample.db.CityModel> mDiffer;
    private com.wf.weatherforcastexample.core.base.adapter.CityInterface interfaceCity;
    
    public CityAdapter() {
        super();
    }
    
    @java.lang.Override()
    public void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.wf.weatherforcastexample.db.CityModel> dataList) {
    }
    
    @java.lang.Override()
    public void addDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.wf.weatherforcastexample.db.CityModel> dataList) {
    }
    
    @java.lang.Override()
    public void clearDataList() {
    }
    
    public final void interfaceInit(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.core.base.adapter.CityInterface interfaceCity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder<com.wf.weatherforcastexample.db.CityModel> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder<com.wf.weatherforcastexample.db.CityModel> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}