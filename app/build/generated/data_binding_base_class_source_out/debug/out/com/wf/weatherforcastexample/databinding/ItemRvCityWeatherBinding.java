// Generated by data binding compiler. Do not edit!
package com.wf.weatherforcastexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.wf.weatherforcastexample.R;
import com.wf.weatherforcastexample.db.CityModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRvCityWeatherBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgWeather;

  @NonNull
  public final TextView tvCity;

  @NonNull
  public final TextView tvTemp;

  @Bindable
  protected CityModel mModel;

  protected ItemRvCityWeatherBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgWeather, TextView tvCity, TextView tvTemp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgWeather = imgWeather;
    this.tvCity = tvCity;
    this.tvTemp = tvTemp;
  }

  public abstract void setModel(@Nullable CityModel model);

  @Nullable
  public CityModel getModel() {
    return mModel;
  }

  @NonNull
  public static ItemRvCityWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_rv_city_weather, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRvCityWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRvCityWeatherBinding>inflateInternal(inflater, R.layout.item_rv_city_weather, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRvCityWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_rv_city_weather, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRvCityWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRvCityWeatherBinding>inflateInternal(inflater, R.layout.item_rv_city_weather, null, false, component);
  }

  public static ItemRvCityWeatherBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemRvCityWeatherBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRvCityWeatherBinding)bind(component, view, R.layout.item_rv_city_weather);
  }
}
