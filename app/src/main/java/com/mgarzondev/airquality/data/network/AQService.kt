package com.mgarzondev.airquality.data.network

import com.mgarzondev.airquality.data.network.model.AQDto
import com.mgarzondev.airquality.data.network.model.Country
import com.mgarzondev.airquality.data.network.model.State
import com.mgarzondev.airquality.data.network.model.City

import retrofit2.http.GET
import retrofit2.http.Url

interface AQService {

    @GET("countries")
    suspend fun getCountries(): List<Country>

    @GET("states/{country}")
    suspend fun getStates(country: String): List<State>

    @GET("city/{country}/{state}")
    suspend fun getCities(country: String, state: String): List<City>

    @GET("weather/{city}/{state}/{country}")
    suspend fun getWeather(city: String, state: String, country: String): AQDto
}