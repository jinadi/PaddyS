package lk.dcs.paddystatistics.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface P0Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertP0(user:P0data)

    @Delete
    suspend fun deleteP0(user:P0data)

//    @Query("SELECT * FROM user WHERE username=:username AND password=:password")
//    suspend fun isAuth(username:String, password:String):User?

    @Query("SELECT * FROM user WHERE id=:id")
    suspend fun getP0ById(id:Int):P0data?
}