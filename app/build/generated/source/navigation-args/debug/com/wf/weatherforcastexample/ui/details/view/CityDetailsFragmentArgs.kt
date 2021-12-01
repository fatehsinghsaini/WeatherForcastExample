package com.wf.weatherforcastexample.ui.details.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CityDetailsFragmentArgs(
  public val city: String,
  public val id: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("city", this.city)
    result.putLong("id", this.id)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CityDetailsFragmentArgs {
      bundle.setClassLoader(CityDetailsFragmentArgs::class.java.classLoader)
      val __city : String?
      if (bundle.containsKey("city")) {
        __city = bundle.getString("city")
        if (__city == null) {
          throw IllegalArgumentException("Argument \"city\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"city\" is missing and does not have an android:defaultValue")
      }
      val __id : Long
      if (bundle.containsKey("id")) {
        __id = bundle.getLong("id")
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      return CityDetailsFragmentArgs(__city, __id)
    }
  }
}
