package com.mgarzondev.airquality.data.local.entities

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName= "currentData")
data class AqEntity(
    @PrimaryKey(true)
    val id: String = "00",
    @ColumnInfo("country")
    val country: String,
    @ColumnInfo("state")
    val state: String,
    @ColumnInfo("city")
    val city: String,
    @ColumnInfo("timestamp")
    val timestamp: String,
    @ColumnInfo("indexAq")
    val indexAq: Int,
    @ColumnInfo("icon")
    val icon: String,
    @ColumnInfo("pm")
    val pm: Int,
    @ColumnInfo("humidity")
    val humidity: Int,
    @ColumnInfo("temperature")
    val temperature: Int,
    @ColumnInfo("windSpeed")
    val windSpeed: Double,

)
