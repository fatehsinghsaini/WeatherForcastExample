package com.wf.weatherforcastexample

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.LocationManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.LocationSettingsStatusCodes
import com.wf.weatherforcastexample.core.base.view.BaseActivity
import com.wf.weatherforcastexample.core.utils.AppConstants.LOCATION_SETTINGS_REQUEST
import com.wf.weatherforcastexample.core.utils.AppConstants.MULTIPLE_LOCATION_PERMISSION
import com.wf.weatherforcastexample.core.utils.setSnackBar
import com.wf.weatherforcastexample.databinding.ActivityMainBinding
import com.wf.weatherforcastexample.ui.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.properties.Delegates

@AndroidEntryPoint
class MainActivityActivity(override val layoutResourceId: Int = R.layout.activity_main) :
    BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    val mViewModel: HomeViewModel by viewModels()
    private var isDialogVisible = false

    val permissions = arrayListOf(
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel.apply {
            setNetworkAvailable(isOnline(this@MainActivityActivity))
            setGpsStatus(isGPSActive())
            setPermissionGranted(hasLocationPermission())
        }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onActivityCreated(dataBinder: ActivityMainBinding) {
        dataBinder.apply {
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            navController = navHostFragment.navController
            activity = this@MainActivityActivity
            viewModel = mViewModel

        }
    }

    fun isOnline(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val capabilities =
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI_AWARE) -> {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
                else -> {
                    return true
                }
            }
        }
        return false
    }

    fun isGPSActive(): Boolean {
        val locationManager = this.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        var gpsEnabled by Delegates.notNull<Boolean>()
        try {
            gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        } catch (e: Exception) {
            return false
        }
        return gpsEnabled
    }

    fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            MULTIPLE_LOCATION_PERMISSION
        )
    }

    fun hasLocationPermission(): Boolean {
        permissions.forEach { permisson ->
            if (ContextCompat.checkSelfPermission(
                    this,
                    permisson
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == MULTIPLE_LOCATION_PERMISSION) {
            var allPermissionsGranted = true
            if (grantResults.isNotEmpty()) {
                grantResults.forEach { permissionResult ->
                    if (permissionResult != PackageManager.PERMISSION_GRANTED) {
                        allPermissionsGranted = false
                    }
                }
                if (allPermissionsGranted) {
                    mViewModel.setPermissionGranted(true)
                } else {
                    navController.navigate(R.id.homeFragment)
                    this.setSnackBar("Provide all the permissions").show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOCATION_SETTINGS_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
                mViewModel.setGpsStatus(true)
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                mViewModel.setGpsStatus(false)
                setSnackBar("Please turn on you GPS!").setAction("Retry") {
                    turnOnGPS()
                }.show()
            }
        }
    }

    fun turnOnGPS() {
        if (isDialogVisible) {
            return
        }
        isDialogVisible = true
        val mLocationRequest = LocationRequest.create()
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
            .setInterval(10 * 1000.toLong())
            .setFastestInterval(1 * 1000.toLong())
        val settingsBuilder = LocationSettingsRequest.Builder()
            .addLocationRequest(mLocationRequest)
        settingsBuilder.setAlwaysShow(true)
        val result = LocationServices.getSettingsClient(this)
            .checkLocationSettings(settingsBuilder.build())

        result.addOnCompleteListener { task ->
            try {
                task.getResult(ApiException::class.java)
                isDialogVisible = false
            } catch (ex: ApiException) {
                when (ex.statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> try {
                        val resolvableApiException =
                            ex as ResolvableApiException
                        resolvableApiException
                            .startResolutionForResult(
                                this,
                                LOCATION_SETTINGS_REQUEST
                            )
                    } catch (e: IntentSender.SendIntentException) {
                        setSnackBar("Unable to turn-on the GPS").show()
                    }
                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {
                    }
                }
            }
        }
    }


}