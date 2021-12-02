package com.wf.weatherforcastexample.ui.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wf.weatherforcastexample.MainActivityActivity
import com.wf.weatherforcastexample.R
import com.wf.weatherforcastexample.core.base.adapter.CityInterface
import com.wf.weatherforcastexample.core.base.view.BaseFragment
import com.wf.weatherforcastexample.core.utils.AppConstants
import com.wf.weatherforcastexample.core.utils.AppConstants.CITY
import com.wf.weatherforcastexample.core.utils.AppConstants.ID
import com.wf.weatherforcastexample.core.utils.ExtensionsApp.isFirst
import com.wf.weatherforcastexample.core.utils.setLogCat
import com.wf.weatherforcastexample.core.utils.setSnackBar
import com.wf.weatherforcastexample.data.ResultData
import com.wf.weatherforcastexample.databinding.FragmentHomeBinding
import com.wf.weatherforcastexample.domain.model.WeatherCityResponse
import com.wf.weatherforcastexample.db.CityModel
import com.wf.weatherforcastexample.ui.home.adapter.CityRvAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.base_recyclerview.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

@AndroidEntryPoint
class HomeFragment(override val layoutResourceLayout: Int = R.layout.fragment_home) :
    BaseFragment<FragmentHomeBinding>() , CityInterface {

    private val adapterCity : CityRvAdapter by lazy { CityRvAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return rootView
    }

    override fun onFragmentCreated(dataBinder: FragmentHomeBinding) {
        dataBinder.apply {
            fragment = this@HomeFragment
            lifecycleOwner = this@HomeFragment
        }
    }

    override fun setUpViewModelStateObservers() {
        (requireActivity() as MainActivityActivity).mViewModel.apply {
            readyToFetch.observe(requireActivity(), { requirements ->
                requirements?.let {
                    if (it["network"] == true) {
                        if (!isFirst(appPreferences)){
                            if (!isFirst(appPreferences) && it["gps"] == true) {
                                fetchWeatherLatLong().observe(requireActivity(), { result -> fetchResult(result) })
                            } else {
                                fetchWeatherByCity("India").observe(requireActivity(), { result -> fetchResult(result) })
                            }
                        }
                    }
                }
            })
        }

        getCities()

    }

    private fun fetchResult(result: ResultData<WeatherCityResponse>) {
        when (result) {
            is ResultData.Success -> { result.data?.let { data -> insertModel(data)  } }
            is ResultData.Failure -> result.msg?.let { msg -> setSnackBar(msg).show() }
            is ResultData.Loading -> { showLoadingView()}
            is ResultData.Internet -> { showNoInternetView()}
        }
    }

    private fun insertModel(model: WeatherCityResponse) {
        if (!isFirst(appPreferences))  appPreferences.setValue(AppConstants.IS_FIRST,true)
        lifecycleScope.launch {

            val resultSize = withContext(Dispatchers.Default){
                (requireActivity() as MainActivityActivity).mViewModel.getSizeCities()
            }

            when (resultSize) {
                is ResultData.Failure -> resultSize.msg?.let { msg -> setSnackBar(msg).show()}
                is ResultData.Loading -> { }
                is ResultData.Internet -> { }
                is ResultData.Success -> {

                    resultSize.data?.let{ size ->
                        if (size < 5){
                            val result = withContext(Dispatchers.Default) {
                                (requireActivity() as MainActivityActivity).mViewModel.insertCity(
                                    CityModel(name = model.name , temp = model.main?.temp
                                    , icon = model.weather?.first()?.icon)
                                )
                            }
                            when (result) {
                                is ResultData.Failure -> result.msg?.let { msg -> setSnackBar(msg).show()}
                                is ResultData.Loading -> { }
                                is ResultData.Internet -> { }
                                is ResultData.Success -> { getCities() }
                            }
                        }
                    }

                }
            }


        }
    }

    private fun getCities() {
        lifecycleScope.launch {
            val result = withContext(Dispatchers.Default){
                (requireActivity() as MainActivityActivity).mViewModel.getCities()
            }

            when (result) {
                is ResultData.Failure -> result.msg?.let { msg -> setSnackBar(msg).show()}
                is ResultData.Loading -> { }
                is ResultData.Internet -> { }
                is ResultData.Success -> { result.data?.let { models -> showMainView(models) }}
            }
        }
    }

    /**
     * layout of No Internet
     */
    private fun showNoInternetView(){
        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(viewNoInternet.root)
            viewNoInternet.cardTryAgain.setOnClickListener {
                extensions.openWifi()
            }
        }
    }

    /**
     * layout of No Loading
     */
    private fun showLoadingView(){
        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(viewLoading.root)
        }
    }

    /**
     * layout of Main
     */
    private fun showMainView(models: List<CityModel>) {

        dataBinder.apply {
            viewFlipper.displayedChild = viewFlipper.indexOfChild(rvCities.rootView)

            adapterCity.setDataList(models)
            adapterCity.interfaceInit(this@HomeFragment)

            rvCities.baseRecyclerview.apply {
                setHasFixedSize(true)
                layoutManager = GridLayoutManager(context, 2 , RecyclerView.VERTICAL, false)
                adapter =adapterCity
            }
        }


    }

    override fun onItemClick(city: String , id: Long) {
        val bundle = bundleOf(CITY to city , ID to id )
        navController.navigate(R.id.action_homeFragment_to_detailsFragment, bundle)
    }

    override fun onItemDeleted(id: Long) {
        (requireActivity() as MainActivityActivity).mViewModel.apply {
            lifecycleScope.launch {
                val result = withContext(Dispatchers.Default) {
                    deleteCity(id)
                }
                when (result) {
                    is ResultData.Failure -> result.msg?.let { msg -> setSnackBar(msg).show() }
                    is ResultData.Loading -> { }
                    is ResultData.Internet -> { }
                    is ResultData.Success -> {
                        this@HomeFragment.getCities()
                        val resultDeleteForecastCity = withContext(Dispatchers.Default) {
                           deleteForecastCity(id)
                        }

                        if (resultDeleteForecastCity is  ResultData.Success) run {
                            setLogCat("TESET_DELETE_RESULT" , "resultDeleteForecastCity")
                        }
                    }
                }
            }
        }

    }


}