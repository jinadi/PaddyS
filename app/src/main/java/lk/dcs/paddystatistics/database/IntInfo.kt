package lk.dcs.paddystatistics.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Year

@Entity
data class IntInfo(
    var district:Int,
    var ds:Int,
    var gnd:Int,
    var agriCenter:Int,
    var village:String,
    var year:Int,
    var assignedOfficer:Int
){
    @PrimaryKey(autoGenerate = true)
    var IntInfoId:Int = 1
}
