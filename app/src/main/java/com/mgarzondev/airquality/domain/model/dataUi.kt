package com.mgarzondev.airquality.domain.model

import android.health.connect.datatypes.units.Temperature

data class dataUi(
    val city: String,
    val country: String,
    val time: String,
    val indexAq: Int,
    val pm: Int,
    val temperature: Int,
    val humidity: Int,
    val windSpeed: Double
)