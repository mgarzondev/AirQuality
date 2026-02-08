package com.mgarzondev.airquality.data.repository

import androidx.lifecycle.Lifecycle
import com.mgarzondev.airquality.data.network.AQService
import com.mgarzondev.airquality.data.network.model.AQDto
import com.mgarzondev.airquality.data.network.model.City
import com.mgarzondev.airquality.data.network.model.Country
import com.mgarzondev.airquality.data.network.model.State

class AirQualityRepository(private val api: AQService) {

    suspend fun getCuntries(): List<Country> {
        return api.getCountries()
    }

    suspend fun getStates(country: String): List<State> {
        return api.getStates(country)
    }

    suspend fun getCities(country: String, state: String): List<City> {
        return api.getCities(country, state)
    }

    suspend fun getWeather(city: String, state: String, country: String): AQDto {
        return api.getWeather(city, state, country)
    }
}