package com.mgarzondev.airquality.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mgarzondev.airquality.data.local.dao.AqDAO
import com.mgarzondev.airquality.data.local.entities.AqEntity

@Database(entities = [AqEntity::class], version = 1)
abstract class AqDatabase: RoomDatabase() {

    abstract fun getAqDao(): AqDAO
}