package com.okom.contactapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.okom.contactapp.db.RoomDbApp
import com.okom.contactapp.db.UserDao
import com.okom.contactapp.db.UserEntity


class MainActivityViewModel(app:Application): AndroidViewModel(app) {
    lateinit var allUsers: MutableLiveData<List<UserEntity>>

        init {

            allUsers = MutableLiveData()
            getAllUsers()

        }
        fun getAllUsersObservers():MutableLiveData<List<UserEntity>>{
            return  allUsers
        }

        fun getAllUsers(){
            val userDao =   RoomDbApp.getAppDatabase((getApplication()))?.UserDao()
            val list =  userDao?.getAllUserInfo()

            allUsers.postValue(list)
        }

        fun insertUserInfo(entity: UserEntity){
            val userDao = RoomDbApp.getAppDatabase(getApplication())?.UserDao()
            UserDao.insertUser(entity)
            getAllUsers()
        }

       fun updateUserInfo(entity: UserEntity) {
           val userDao = RoomDbApp.getAppDatabase(getApplication())?.UserDao()
           UserDao.updateUser(entity)
           getAllUsers()
       }

       fun deleteUserInfo(entity: UserEntity){
           val userDao = RoomDbApp.getAppDatabase(getApplication())?.UserDao()
           UserDao.deleteUser(entity)
           getAllUsers()
}