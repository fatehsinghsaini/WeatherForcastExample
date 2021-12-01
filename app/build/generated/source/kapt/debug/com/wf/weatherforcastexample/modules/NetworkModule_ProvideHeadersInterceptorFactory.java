// Generated by Dagger (https://dagger.dev).
package com.wf.weatherforcastexample.modules;

import android.content.Context;
import com.wf.weatherforcastexample.core.utils.AppPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Interceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHeadersInterceptorFactory implements Factory<Interceptor> {
  private final Provider<AppPreferences> appPreferencesProvider;

  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideHeadersInterceptorFactory(
      Provider<AppPreferences> appPreferencesProvider, Provider<Context> contextProvider) {
    this.appPreferencesProvider = appPreferencesProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public Interceptor get() {
    return provideHeadersInterceptor(appPreferencesProvider.get(), contextProvider.get());
  }

  public static NetworkModule_ProvideHeadersInterceptorFactory create(
      Provider<AppPreferences> appPreferencesProvider, Provider<Context> contextProvider) {
    return new NetworkModule_ProvideHeadersInterceptorFactory(appPreferencesProvider, contextProvider);
  }

  public static Interceptor provideHeadersInterceptor(AppPreferences appPreferences,
      Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideHeadersInterceptor(appPreferences, context));
  }
}
