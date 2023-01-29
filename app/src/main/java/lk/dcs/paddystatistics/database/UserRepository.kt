package lk.dcs.paddystatistics.database

class UserRepository(private val db:MyDatabase) {

    suspend fun insertUser(user: User) = db.getUserDao().insertUser(user)
    suspend fun deleteUser(user: User) = db.getUserDao().deleteUser(user)
    suspend fun isAuth(username:String, password:String) = db.getUserDao().isAuth(username,password)
    suspend fun getUserById(id:Int) = db.getUserDao().getUserById(id)
}