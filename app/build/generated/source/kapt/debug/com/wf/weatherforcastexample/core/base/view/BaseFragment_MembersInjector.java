// Generated by Dagger (https://dagger.dev).
package com.wf.weatherforcastexample.core.base.view;

import androidx.databinding.ViewDataBinding;
import com.wf.weatherforcastexample.core.utils.AppPreferences;
import com.wf.weatherforcastexample.core.utils.Extensions;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseFragment_MembersInjector<T extends ViewDataBinding> implements MembersInjector<BaseFragment<T>> {
  private final Provider<Extensions> extensionsProvider;

  private final Provider<AppPreferences> appPreferencesProvider;

  public BaseFragment_MembersInjector(Provider<Extensions> extensionsProvider,
      Provider<AppPreferences> appPreferencesProvider) {
    this.extensionsProvider = extensionsProvider;
    this.appPreferencesProvider = appPreferencesProvider;
  }

  public static <T extends ViewDataBinding> MembersInjector<BaseFragment<T>> create(
      Provider<Extensions> extensionsProvider, Provider<AppPreferences> appPreferencesProvider) {
    return new BaseFragment_MembersInjector<T>(extensionsProvider, appPreferencesProvider);
  }

  @Override
  public void injectMembers(BaseFragment<T> instance) {
    injectExtensions(instance, extensionsProvider.get());
    injectAppPreferences(instance, appPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.wf.weatherforcastexample.core.base.view.BaseFragment.extensions")
  public static <T extends ViewDataBinding> void injectExtensions(BaseFragment<T> instance,
      Extensions extensions) {
    instance.extensions = extensions;
  }

  @InjectedFieldSignature("com.wf.weatherforcastexample.core.base.view.BaseFragment.appPreferences")
  public static <T extends ViewDataBinding> void injectAppPreferences(BaseFragment<T> instance,
      AppPreferences appPreferences) {
    instance.appPreferences = appPreferences;
  }
}
