package lk.dcs.paddystatistics.ui.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import lk.dcs.paddystatistics.database.User
import lk.dcs.paddystatistics.database.UserRepository

class LoginViewModel(private val userRepository: UserRepository ):ViewModel() {

    var username = mutableStateOf("")
    var password = mutableStateOf("")
    var userById: User? = null

    fun isAuth(username:String, password:String) = viewModelScope.launch(Dispatchers.IO){
        userById = userRepository.isAuth(username,password)
    }


    fun insertUser(user: User) = viewModelScope.launch {
        userRepository.insertUser(user)
    }

}