package lk.dcs.paddystatistics.ui.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import lk.dcs.paddystatistics.database.IntInfo
import lk.dcs.paddystatistics.database.IntInfoRepository
import lk.dcs.paddystatistics.database.User
import lk.dcs.paddystatistics.database.UserRepository

class IntInfoViewModel(private val intInfoRepository: IntInfoRepository):ViewModel() {

    var district = mutableStateOf("")
    var dsd = mutableStateOf("")
    var gnd = mutableStateOf("")
    var agriCenter = mutableStateOf("")
    var village = mutableStateOf("")
    var userById: User? = null

    /*fun isAuth(username:String, password:String) = viewModelScope.launch(Dispatchers.IO){
        userById = userRepository.isAuth(username,password)
    }*/


    /*fun insertIntInfo(intInfo: IntInfo) = viewModelScope.launch {
        intInfoRepository.insertIntInfo(intInfo)
    }*/
}