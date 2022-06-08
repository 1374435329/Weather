package com.android.weather.logic.network

import com.android.weather.SunnyWeatherApplication
import com.android.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query:String):Call<PlaceResponse>
}