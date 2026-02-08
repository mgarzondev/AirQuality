package com.mgarzondev.airquality.ui.home

data class HomeState(
    var indiceAQI: Int,
    var ciudad: String,
    var pais: String,
    var status: String? = null,
    var cardpm25: Int,
    var cardpm10: Int,
    var card03: Int,
    var cardNo2: Int,
    var isLoading: Boolean = false,
)
