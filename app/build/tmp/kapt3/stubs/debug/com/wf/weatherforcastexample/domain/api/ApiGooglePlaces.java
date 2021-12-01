package com.wf.weatherforcastexample.domain.api;

import com.wf.weatherforcastexample.core.utils.AppConstants;
import com.wf.weatherforcastexample.domain.model.placeId.PlaceIdResponse;
import com.wf.weatherforcastexample.domain.model.predictions.PredictionsResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/wf/weatherforcastexample/domain/api/ApiGooglePlaces;", "", "fetchGooglePlaceOfLatLon", "Lretrofit2/Response;", "Lcom/wf/weatherforcastexample/domain/model/placeId/PlaceIdResponse;", "placeId", "", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPredictions", "Lcom/wf/weatherforcastexample/domain/model/predictions/PredictionsResponse;", "searchText", "app_debug"})
public abstract interface ApiGooglePlaces {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "autocomplete/json")
    public abstract java.lang.Object getPredictions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "input")
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wf.weatherforcastexample.domain.model.predictions.PredictionsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "details/json")
    public abstract java.lang.Object fetchGooglePlaceOfLatLon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "placeid")
    java.lang.String placeId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.wf.weatherforcastexample.domain.model.placeId.PlaceIdResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}