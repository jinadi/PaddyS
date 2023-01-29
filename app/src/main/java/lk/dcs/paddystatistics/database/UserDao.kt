package lk.dcs.paddystatistics.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user:User)

    @Delete
    suspend fun deleteUser(user:User)

    @Query("SELECT * FROM user WHERE username=:username AND password=:password")
    suspend fun isAuth(username:String, password:String):User?

    @Query("SELECT * FROM user WHERE id=:id")
    suspend fun getUserById(id:Int):User?
}