package com.wf.weatherforcastexample.core.base.adapter;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lcom/wf/weatherforcastexample/core/base/adapter/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "itemRowBinding", "getItemRowBinding", "()Landroidx/databinding/ViewDataBinding;", "setItemRowBinding", "bind", "", "result", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final androidx.databinding.ViewDataBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ViewDataBinding itemRowBinding;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.databinding.ViewDataBinding getItemRowBinding() {
        return null;
    }
    
    public void setItemRowBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    public abstract void bind(T result);
}