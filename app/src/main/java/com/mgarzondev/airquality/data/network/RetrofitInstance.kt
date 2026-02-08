package com.mgarzondev.airquality.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "localhost:8080/api/air-quality/"

    val api: AQService by lazy {  // Solo se crea la primera vez que se usa
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AQService::class.java)
    }
}