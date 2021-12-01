package com.wf.weatherforcastexample.core.base.adapter;

import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\b\u0010\t\u001a\u00020\u0006H&J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/wf/weatherforcastexample/core/base/adapter/BaseAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/wf/weatherforcastexample/core/base/adapter/BaseViewHolder;", "()V", "addDataList", "", "dataList", "", "clearDataList", "setDataList", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.wf.weatherforcastexample.core.base.adapter.BaseViewHolder<T>> {
    
    public BaseAdapter() {
        super();
    }
    
    public abstract void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> dataList);
    
    public abstract void addDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> dataList);
    
    public abstract void clearDataList();
}