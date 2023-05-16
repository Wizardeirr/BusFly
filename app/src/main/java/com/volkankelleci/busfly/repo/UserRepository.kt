package com.volkankelleci.busfly.repo

import androidx.lifecycle.LiveData
import com.volkankelleci.busfly.room.User
import com.volkankelleci.busfly.room.UserDao

class UserRepository(private val userDao:UserDao) {
    suspend fun insertUser(user:User)=userDao.insertUser(user)

    suspend fun getAllUsers(): List<User> = userDao.getUsers()
}