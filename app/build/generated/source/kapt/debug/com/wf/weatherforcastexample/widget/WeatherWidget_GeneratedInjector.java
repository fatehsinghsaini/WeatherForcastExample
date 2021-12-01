package com.wf.weatherforcastexample.widget;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WeatherWidget.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WeatherWidget_GeneratedInjector {
  void injectWeatherWidget(WeatherWidget weatherWidget);
}
