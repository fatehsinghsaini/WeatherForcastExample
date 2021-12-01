package com.wf.weatherforcastexample.core.utils

import com.wf.weatherforcastexample.core.utils.AppConstants.IS_FIRST
import com.wf.weatherforcastexample.core.utils.AppConstants.LOCALE
import com.wf.weatherforcastexample.core.utils.AppPreferences
import java.util.*

object ExtensionsApp {

    fun getLocale(appPreferences: AppPreferences): String =appPreferences.getStringValue(LOCALE, Locale.getDefault().language)
    fun isFirst(appPreferences: AppPreferences): Boolean =appPreferences.getBooleanValue(IS_FIRST , false)


}
