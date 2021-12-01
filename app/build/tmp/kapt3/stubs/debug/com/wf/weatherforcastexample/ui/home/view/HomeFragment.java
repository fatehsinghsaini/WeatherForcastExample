package com.wf.weatherforcastexample.ui.home.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.wf.weatherforcastexample.MainActivityActivity;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.base.adapter.CityInterface;
import com.wf.weatherforcastexample.core.base.view.BaseFragment;
import com.wf.weatherforcastexample.core.utils.AppConstants;
import com.wf.weatherforcastexample.data.ResultData;
import com.wf.weatherforcastexample.databinding.FragmentHomeBinding;
import com.wf.weatherforcastexample.domain.model.WeatherCityResponse;
import com.wf.weatherforcastexample.db.CityModel;
import com.wf.weatherforcastexample.ui.home.adapter.CityRvAdapter;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.activity_main.*;
import kotlinx.android.synthetic.main.base_recyclerview.view.*;
import kotlinx.coroutines.Dispatchers;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010\'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0002J\u0016\u0010)\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\b\u0010-\u001a\u00020\u0010H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006."}, d2 = {"Lcom/wf/weatherforcastexample/ui/home/view/HomeFragment;", "Lcom/wf/weatherforcastexample/core/base/view/BaseFragment;", "Lcom/wf/weatherforcastexample/databinding/FragmentHomeBinding;", "Lcom/wf/weatherforcastexample/core/base/adapter/CityInterface;", "layoutResourceLayout", "", "(I)V", "adapterCity", "Lcom/wf/weatherforcastexample/ui/home/adapter/CityRvAdapter;", "getAdapterCity", "()Lcom/wf/weatherforcastexample/ui/home/adapter/CityRvAdapter;", "adapterCity$delegate", "Lkotlin/Lazy;", "getLayoutResourceLayout", "()I", "fetchResult", "", "result", "Lcom/wf/weatherforcastexample/data/ResultData;", "Lcom/wf/weatherforcastexample/domain/model/WeatherCityResponse;", "getCities", "insertModel", "model", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentCreated", "dataBinder", "onItemClick", "city", "", "id", "", "onItemDeleted", "setUpViewModelStateObservers", "showLoadingView", "showMainView", "models", "", "Lcom/wf/weatherforcastexample/db/CityModel;", "showNoInternetView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.wf.weatherforcastexample.core.base.view.BaseFragment<com.wf.weatherforcastexample.databinding.FragmentHomeBinding> implements com.wf.weatherforcastexample.core.base.adapter.CityInterface {
    private final int layoutResourceLayout = 0;
    private final kotlin.Lazy adapterCity$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    public HomeFragment(int layoutResourceLayout) {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutResourceLayout() {
        return 0;
    }
    
    private final com.wf.weatherforcastexample.ui.home.adapter.CityRvAdapter getAdapterCity() {
        return null;
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
    com.wf.weatherforcastexample.databinding.FragmentHomeBinding dataBinder) {
    }
    
    @java.lang.Override()
    public void setUpViewModelStateObservers() {
    }
    
    private final void fetchResult(com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.WeatherCityResponse> result) {
    }
    
    private final void insertModel(com.wf.weatherforcastexample.domain.model.WeatherCityResponse model) {
    }
    
    private final void getCities() {
    }
    
    /**
     * layout of No Internet
     */
    private final void showNoInternetView() {
    }
    
    /**
     * layout of No Loading
     */
    private final void showLoadingView() {
    }
    
    /**
     * layout of Main
     */
    private final void showMainView(java.util.List<com.wf.weatherforcastexample.db.CityModel> models) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String city, long id) {
    }
    
    @java.lang.Override()
    public void onItemDeleted(long id) {
    }
}