package com.wf.weatherforcastexample.ui.details.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.wf.weatherforcastexample.MainActivityActivity;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.core.base.view.BaseFragment;
import com.wf.weatherforcastexample.data.ResultData;
import com.wf.weatherforcastexample.db.ForecastCityModel;
import com.wf.weatherforcastexample.db.ForecastRow;
import com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse;
import com.wf.weatherforcastexample.ui.details.adapter.ForecastCityRvAdapter;
import com.wf.weatherforcastexample.ui.details.viewModel.DetailsViewModel;
import com.wf.weatherforcastexample.databinding.FragmentCityDetailsBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.base_recyclerview.view.*;
import kotlinx.coroutines.Dispatchers;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\b\u0010,\u001a\u00020\u0019H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lcom/wf/weatherforcastexample/ui/details/view/CityDetailsFragment;", "Lcom/wf/weatherforcastexample/core/base/view/BaseFragment;", "Lcom/wf/weatherforcastexample/databinding/FragmentCityDetailsBinding;", "layoutResourceLayout", "", "(I)V", "adapterForecastCity", "Lcom/wf/weatherforcastexample/ui/details/adapter/ForecastCityRvAdapter;", "getAdapterForecastCity", "()Lcom/wf/weatherforcastexample/ui/details/adapter/ForecastCityRvAdapter;", "adapterForecastCity$delegate", "Lkotlin/Lazy;", "city", "", "id", "", "Ljava/lang/Long;", "getLayoutResourceLayout", "()I", "viewModel", "Lcom/wf/weatherforcastexample/ui/details/viewModel/DetailsViewModel;", "getViewModel", "()Lcom/wf/weatherforcastexample/ui/details/viewModel/DetailsViewModel;", "viewModel$delegate", "fetchResult", "", "result", "Lcom/wf/weatherforcastexample/data/ResultData;", "Lcom/wf/weatherforcastexample/domain/model/forecest/ForecastCityResponse;", "fetchResultLocal", "insertData", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentCreated", "dataBinder", "setUpViewModelStateObservers", "showLoadingView", "showMainView", "Lcom/wf/weatherforcastexample/db/ForecastCityModel;", "showNoInternetView", "updateData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CityDetailsFragment extends com.wf.weatherforcastexample.core.base.view.BaseFragment<com.wf.weatherforcastexample.databinding.FragmentCityDetailsBinding> {
    private final int layoutResourceLayout = 0;
    private java.lang.String city;
    private java.lang.Long id;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapterForecastCity$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CityDetailsFragment() {
        super();
    }
    
    public CityDetailsFragment(int layoutResourceLayout) {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutResourceLayout() {
        return 0;
    }
    
    private final com.wf.weatherforcastexample.ui.details.viewModel.DetailsViewModel getViewModel() {
        return null;
    }
    
    private final com.wf.weatherforcastexample.ui.details.adapter.ForecastCityRvAdapter getAdapterForecastCity() {
        return null;
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
    com.wf.weatherforcastexample.databinding.FragmentCityDetailsBinding dataBinder) {
    }
    
    @java.lang.Override()
    public void setUpViewModelStateObservers() {
    }
    
    private final void fetchResultLocal() {
    }
    
    private final void fetchResult(com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse> result) {
    }
    
    private final void insertData(com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse data) {
    }
    
    private final void updateData(com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse data) {
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
    private final void showMainView(com.wf.weatherforcastexample.db.ForecastCityModel data) {
    }
}