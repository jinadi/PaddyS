package lk.dcs.paddystatistics.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class MyDatabase: RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getInstance(context: Context): MyDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "my_db"
                ).build().also { INSTANCE = it }
            }
        }
    }

}