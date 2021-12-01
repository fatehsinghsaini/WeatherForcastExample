package com.wf.weatherforcastexample.ui.details.viewModel;

import androidx.lifecycle.*;
import com.wf.weatherforcastexample.db.ForecastCityModel;
import com.wf.weatherforcastexample.ui.details.repo.DetailsRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0011\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/wf/weatherforcastexample/ui/details/viewModel/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "detailsRepository", "Lcom/wf/weatherforcastexample/ui/details/repo/DetailsRepository;", "(Lcom/wf/weatherforcastexample/ui/details/repo/DetailsRepository;)V", "findCityForecastData", "Landroidx/lifecycle/LiveData;", "Lcom/wf/weatherforcastexample/data/ResultData;", "Lcom/wf/weatherforcastexample/domain/model/forecest/ForecastCityResponse;", "city", "", "getForecastCity", "Lcom/wf/weatherforcastexample/db/ForecastCityModel;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertForecastCity", "forecastCity", "(Lcom/wf/weatherforcastexample/db/ForecastCityModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.wf.weatherforcastexample.ui.details.repo.DetailsRepository detailsRepository = null;
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.ui.details.repo.DetailsRepository detailsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.domain.model.forecest.ForecastCityResponse>> findCityForecastData(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertForecastCity(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.ForecastCityModel forecastCity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.lang.Long>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getForecastCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<com.wf.weatherforcastexample.db.ForecastCityModel>> continuation) {
        return null;
    }
}