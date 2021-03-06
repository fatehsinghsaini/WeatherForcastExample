// Generated by data binding compiler. Do not edit!
package com.wf.weatherforcastexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.wf.weatherforcastexample.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContainerSplashBinding extends ViewDataBinding {
  @NonNull
  public final ImageView animationView;

  protected ContainerSplashBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView animationView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
  }

  @NonNull
  public static ContainerSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.container_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContainerSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContainerSplashBinding>inflateInternal(inflater, R.layout.container_splash, root, attachToRoot, component);
  }

  @NonNull
  public static ContainerSplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.container_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContainerSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContainerSplashBinding>inflateInternal(inflater, R.layout.container_splash, null, false, component);
  }

  public static ContainerSplashBinding bind(@NonNull View view) {
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
  public static ContainerSplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContainerSplashBinding)bind(component, view, R.layout.container_splash);
  }
}
