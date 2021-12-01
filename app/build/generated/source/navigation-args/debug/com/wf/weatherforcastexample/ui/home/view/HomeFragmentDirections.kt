package com.wf.weatherforcastexample.ui.home.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.wf.weatherforcastexample.R
import kotlin.Int
import kotlin.Long
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    public val city: String,
    public val id: Long
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_detailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("city", this.city)
      result.putLong("id", this.id)
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToDetailsFragment(city: String, id: Long): NavDirections =
        ActionHomeFragmentToDetailsFragment(city, id)
  }
}
