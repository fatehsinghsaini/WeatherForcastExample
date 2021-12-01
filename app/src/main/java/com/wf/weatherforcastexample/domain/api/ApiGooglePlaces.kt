package com.wf.weatherforcastexample.domain.api

import com.wf.weatherforcastexample.core.utils.AppConstants
import com.wf.weatherforcastexample.core.utils.AppConstants.GOOGLE_PLACE_API_QUERY
import com.wf.weatherforcastexample.domain.model.placeId.PlaceIdResponse
import com.wf.weatherforcastexample.domain.model.predictions.PredictionsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiGooglePlaces {

  @GET("autocomplete/json")
  suspend fun getPredictions(
    @Query("input") searchText: String,
    @Query(GOOGLE_PLACE_API_QUERY) key: String = AppConstants.GOOGLE_PLACE_API_KEY
  ): Response<PredictionsResponse>

  @GET("details/json")
  suspend fun fetchGooglePlaceOfLatLon(
    @Query("placeid") placeId: String,
    @Query(GOOGLE_PLACE_API_QUERY) key: String = AppConstants.GOOGLE_PLACE_API_KEY
  ): Response<PlaceIdResponse>

}