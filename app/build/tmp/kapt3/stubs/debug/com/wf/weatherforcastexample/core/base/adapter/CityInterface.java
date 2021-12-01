package com.wf.weatherforcastexample.core.base.adapter;

import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/wf/weatherforcastexample/core/base/adapter/CityInterface;", "", "onItemClick", "", "city", "", "id", "", "onItemDeleted", "app_debug"})
public abstract interface CityInterface {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String city, long id);
    
    public abstract void onItemDeleted(long id);
}