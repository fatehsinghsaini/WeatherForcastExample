package com.wf.weatherforcastexample.domain.api

import com.wf.weatherforcastexample.core.utils.NoInternetException
import com.wf.weatherforcastexample.data.ResultData
import com.google.android.gms.common.api.ApiException
import retrofit2.Response


/**
 * Abstract Base Data source class with error handling
 */
abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): ResultData<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return ResultData.Success(body)
            }
            return ResultData.Failure(
                msg = response.code().toString() + " " + response.message().toString()
            )
        } catch (e: ApiException) {
            return ResultData.Failure(msg = e.message.toString())
        } catch (e: NoInternetException) {
            return ResultData.Internet()
        } catch (e: Exception) {
            return ResultData.Failure(msg = e.message.toString())
        }
    }
}

