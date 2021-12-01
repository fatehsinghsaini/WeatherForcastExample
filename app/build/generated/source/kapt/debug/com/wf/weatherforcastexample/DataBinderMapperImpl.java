package com.wf.weatherforcastexample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.wf.weatherforcastexample.databinding.ActivityMainBindingImpl;
import com.wf.weatherforcastexample.databinding.ContainerDetailsBindingImpl;
import com.wf.weatherforcastexample.databinding.ContainerSplashBindingImpl;
import com.wf.weatherforcastexample.databinding.FragmentCityDetailsBindingImpl;
import com.wf.weatherforcastexample.databinding.FragmentHomeBindingImpl;
import com.wf.weatherforcastexample.databinding.FragmentSplashBindingImpl;
import com.wf.weatherforcastexample.databinding.ItemRvCityWeatherBindingImpl;
import com.wf.weatherforcastexample.databinding.ItemRvForcastBindingImpl;
import com.wf.weatherforcastexample.databinding.ViewLoadingBindingImpl;
import com.wf.weatherforcastexample.databinding.ViewNoGpsBindingImpl;
import com.wf.weatherforcastexample.databinding.ViewNoInternetBindingImpl;
import com.wf.weatherforcastexample.databinding.ViewNoPermissionsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CONTAINERDETAILS = 2;

  private static final int LAYOUT_CONTAINERSPLASH = 3;

  private static final int LAYOUT_FRAGMENTCITYDETAILS = 4;

  private static final int LAYOUT_FRAGMENTHOME = 5;

  private static final int LAYOUT_FRAGMENTSPLASH = 6;

  private static final int LAYOUT_ITEMRVCITYWEATHER = 7;

  private static final int LAYOUT_ITEMRVFORCAST = 8;

  private static final int LAYOUT_VIEWLOADING = 9;

  private static final int LAYOUT_VIEWNOGPS = 10;

  private static final int LAYOUT_VIEWNOINTERNET = 11;

  private static final int LAYOUT_VIEWNOPERMISSIONS = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.container_details, LAYOUT_CONTAINERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.container_splash, LAYOUT_CONTAINERSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.fragment_city_details, LAYOUT_FRAGMENTCITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.item_rv_city_weather, LAYOUT_ITEMRVCITYWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.item_rv_forcast, LAYOUT_ITEMRVFORCAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.view_loading, LAYOUT_VIEWLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.view_no_gps, LAYOUT_VIEWNOGPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.view_no_internet, LAYOUT_VIEWNOINTERNET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.wf.weatherforcastexample.R.layout.view_no_permissions, LAYOUT_VIEWNOPERMISSIONS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTAINERDETAILS: {
          if ("layout/container_details_0".equals(tag)) {
            return new ContainerDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for container_details is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTAINERSPLASH: {
          if ("layout/container_splash_0".equals(tag)) {
            return new ContainerSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for container_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCITYDETAILS: {
          if ("layout/fragment_city_details_0".equals(tag)) {
            return new FragmentCityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_city_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRVCITYWEATHER: {
          if ("layout/item_rv_city_weather_0".equals(tag)) {
            return new ItemRvCityWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rv_city_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRVFORCAST: {
          if ("layout/item_rv_forcast_0".equals(tag)) {
            return new ItemRvForcastBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rv_forcast is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWLOADING: {
          if ("layout/view_loading_0".equals(tag)) {
            return new ViewLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWNOGPS: {
          if ("layout/view_no_gps_0".equals(tag)) {
            return new ViewNoGpsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_no_gps is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWNOINTERNET: {
          if ("layout/view_no_internet_0".equals(tag)) {
            return new ViewNoInternetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_no_internet is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWNOPERMISSIONS: {
          if ("layout/view_no_permissions_0".equals(tag)) {
            return new ViewNoPermissionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_no_permissions is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "fragment");
      sKeys.put(3, "model");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_main_0", com.wf.weatherforcastexample.R.layout.activity_main);
      sKeys.put("layout/container_details_0", com.wf.weatherforcastexample.R.layout.container_details);
      sKeys.put("layout/container_splash_0", com.wf.weatherforcastexample.R.layout.container_splash);
      sKeys.put("layout/fragment_city_details_0", com.wf.weatherforcastexample.R.layout.fragment_city_details);
      sKeys.put("layout/fragment_home_0", com.wf.weatherforcastexample.R.layout.fragment_home);
      sKeys.put("layout/fragment_splash_0", com.wf.weatherforcastexample.R.layout.fragment_splash);
      sKeys.put("layout/item_rv_city_weather_0", com.wf.weatherforcastexample.R.layout.item_rv_city_weather);
      sKeys.put("layout/item_rv_forcast_0", com.wf.weatherforcastexample.R.layout.item_rv_forcast);
      sKeys.put("layout/view_loading_0", com.wf.weatherforcastexample.R.layout.view_loading);
      sKeys.put("layout/view_no_gps_0", com.wf.weatherforcastexample.R.layout.view_no_gps);
      sKeys.put("layout/view_no_internet_0", com.wf.weatherforcastexample.R.layout.view_no_internet);
      sKeys.put("layout/view_no_permissions_0", com.wf.weatherforcastexample.R.layout.view_no_permissions);
    }
  }
}
