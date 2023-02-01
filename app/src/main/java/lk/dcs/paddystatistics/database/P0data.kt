package lk.dcs.paddystatistics.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class P0data(
    var year: String,
    var irrtype: String,
    var acr: Float,
    var reason: String,
    var acr1: Float,
    var rood1: Int,
    var perches: Int

){
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}
