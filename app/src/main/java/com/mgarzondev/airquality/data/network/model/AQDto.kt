package com.mgarzondev.airquality.data.network.model

import com.google.gson.annotations.SerializedName

data class AQDto(
    @SerializedName("city")
    val city: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("current")
    val current: CurrentData
    )

data class CurrentData(
    @SerializedName("pollution")
    val pollution: PollutionData,
    @SerializedName("weather")
    val weatherDTO: WeatherDTO
)

data class PollutionData(
    @SerializedName("ts")
    val ts: String,
    @SerializedName("aqius")
    val aqius: Int,
    @SerializedName("mainus")
    val mainus: String
)

data class WeatherDTO(
    @SerializedName("tp")
    val temperature: Int,
    @SerializedName("ic")
    val icon: String,
    @SerializedName("hu")
    val humidity: Int,
    @SerializedName("ws")
    val windSpeed: Double
)