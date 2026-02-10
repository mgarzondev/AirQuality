package com.mgarzondev.airquality.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mgarzondev.airquality.data.local.entities.AqEntity

@Dao
interface AqDAO {

    @Query("SELECT * FROM currentData")
    suspend fun getCurrentData(): AqEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrentData(aqEntity: AqEntity)
}