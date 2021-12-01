package com.wf.weatherforcastexample.ui.splash.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wf.weatherforcastexample.MainActivityActivity
import com.wf.weatherforcastexample.R
import com.wf.weatherforcastexample.core.base.view.BaseFragment
import com.wf.weatherforcastexample.core.utils.AppConstants.SPLASH_TIME_OUT
import com.wf.weatherforcastexample.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
@AndroidEntryPoint
class SplashFragment (override val layoutResourceLayout: Int = R.layout.fragment_splash) : BaseFragment<FragmentSplashBinding>(){

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        return rootView
    }

    override fun onFragmentCreated(dataBinder: FragmentSplashBinding) {
        dataBinder.apply {
            fragment = this@SplashFragment
            lifecycleOwner = this@SplashFragment
        }


    }

    override fun setUpViewModelStateObservers() {
        print("")
    }

    override fun onResume() {
        super.onResume()
        Handler(Looper.getMainLooper()).postDelayed({
            (requireActivity() as MainActivityActivity).mViewModel.readyToFetch.observe(requireActivity(),
                { requirements ->
                    requirements?.let {
                        if ( it["permission"] == true) {
                            navController.navigate(R.id.homeFragment)
                        } else if (it["permission"] == false) {
                            showTakePermissions()
                        }
                    }
                }
            )
        }, SPLASH_TIME_OUT)

    }

    /**
     * layout of No Internet
     */
    private fun showNoInternet(){
        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(viewNoInternet.root)
            viewNoInternet.cardTryAgain.setOnClickListener {
                extensions.openWifi()
            }
        }
    }

    /**
     * layout of No Gps
     */
    private fun showNoGps(){
        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(viewNoGps.root)
            viewNoGps.cardTryAgain.setOnClickListener {
                (requireActivity() as MainActivityActivity).turnOnGPS()
            }
        }
    }

    /**
     * layout of Take Permissions
     */
    private fun showTakePermissions(){
        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(viewTakePermissions.root)
            viewTakePermissions.cardTryAgain.setOnClickListener {
                (requireActivity() as MainActivityActivity).requestLocationPermission()
            }
        }
    }






}