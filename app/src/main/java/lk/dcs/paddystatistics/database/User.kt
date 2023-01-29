package lk.dcs.paddystatistics.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    var username: String,
    var password: String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}
