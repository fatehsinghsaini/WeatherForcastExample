// Generated by data binding compiler. Do not edit!
package com.wf.weatherforcastexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.wf.weatherforcastexample.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContainerDetailsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgWeather;

  @NonNull
  public final View rvForecast;

  @NonNull
  public final TextView textLabelDegree;

  @NonNull
  public final TextView tvCity;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvTemp;

  protected ContainerDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgWeather, View rvForecast, TextView textLabelDegree, TextView tvCity,
      TextView tvDate, TextView tvTemp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgWeather = imgWeather;
    this.rvForecast = rvForecast;
    this.textLabelDegree = textLabelDegree;
    this.tvCity = tvCity;
    this.tvDate = tvDate;
    this.tvTemp = tvTemp;
  }

  @NonNull
  public static ContainerDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.container_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContainerDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContainerDetailsBinding>inflateInternal(inflater, R.layout.container_details, root, attachToRoot, component);
  }

  @NonNull
  public static ContainerDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.container_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContainerDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContainerDetailsBinding>inflateInternal(inflater, R.layout.container_details, null, false, component);
  }

  public static ContainerDetailsBinding bind(@NonNull View view) {
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
  public static ContainerDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContainerDetailsBinding)bind(component, view, R.layout.container_details);
  }
}
