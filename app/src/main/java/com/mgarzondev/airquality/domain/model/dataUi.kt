package com.mgarzondev.airquality.domain.model

import android.health.connect.datatypes.units.Temperature

data class dataUi(
    val city: String = "",
    val country: String = "",
    val time: String = "",
    val indexAq: Int = 0,
    val pm: Int = 0,
    val temperature: Int = 0,
    val humidity: Int = 0,
    val windSpeed: Double = 0.0
)