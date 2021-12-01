package com.wf.weatherforcastexample.ui.splash.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.wf.weatherforcastexample.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashScreenFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreenFragment_to_homeFragment)
  }
}
