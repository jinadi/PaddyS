package lk.dcs.paddystatistics.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface IntInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIntInfo(intInfo: IntInfo)

    @Delete
    suspend fun deleteIntInfo(intInfo: IntInfo)

    ////
}