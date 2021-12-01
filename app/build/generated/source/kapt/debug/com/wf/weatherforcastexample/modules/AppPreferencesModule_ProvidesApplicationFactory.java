// Generated by Dagger (https://dagger.dev).
package com.wf.weatherforcastexample.modules;

import android.content.Context;
import com.wf.weatherforcastexample.BaseApp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppPreferencesModule_ProvidesApplicationFactory implements Factory<BaseApp> {
  private final Provider<Context> appProvider;

  public AppPreferencesModule_ProvidesApplicationFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public BaseApp get() {
    return providesApplication(appProvider.get());
  }

  public static AppPreferencesModule_ProvidesApplicationFactory create(
      Provider<Context> appProvider) {
    return new AppPreferencesModule_ProvidesApplicationFactory(appProvider);
  }

  public static BaseApp providesApplication(Context app) {
    return Preconditions.checkNotNullFromProvides(AppPreferencesModule.INSTANCE.providesApplication(app));
  }
}
