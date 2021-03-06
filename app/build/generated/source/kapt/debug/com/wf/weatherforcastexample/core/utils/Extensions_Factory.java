// Generated by Dagger (https://dagger.dev).
package com.wf.weatherforcastexample.core.utils;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Extensions_Factory implements Factory<Extensions> {
  private final Provider<Application> androidApplicationProvider;

  public Extensions_Factory(Provider<Application> androidApplicationProvider) {
    this.androidApplicationProvider = androidApplicationProvider;
  }

  @Override
  public Extensions get() {
    return newInstance(androidApplicationProvider.get());
  }

  public static Extensions_Factory create(Provider<Application> androidApplicationProvider) {
    return new Extensions_Factory(androidApplicationProvider);
  }

  public static Extensions newInstance(Application androidApplication) {
    return new Extensions(androidApplication);
  }
}
