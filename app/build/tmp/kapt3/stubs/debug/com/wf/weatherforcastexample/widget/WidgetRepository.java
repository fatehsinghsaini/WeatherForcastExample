package com.wf.weatherforcastexample.widget;

import com.wf.weatherforcastexample.data.ResultData;
import com.wf.weatherforcastexample.db.CityDao;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/wf/weatherforcastexample/widget/WidgetRepository;", "", "cityDao", "Lcom/wf/weatherforcastexample/db/CityDao;", "(Lcom/wf/weatherforcastexample/db/CityDao;)V", "getCities", "Lcom/wf/weatherforcastexample/data/ResultData;", "", "Lcom/wf/weatherforcastexample/db/CityModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WidgetRepository {
    private final com.wf.weatherforcastexample.db.CityDao cityDao = null;
    
    @javax.inject.Inject()
    public WidgetRepository(@org.jetbrains.annotations.NotNull()
    com.wf.weatherforcastexample.db.CityDao cityDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wf.weatherforcastexample.data.ResultData<java.util.List<com.wf.weatherforcastexample.db.CityModel>>> continuation) {
        return null;
    }
}