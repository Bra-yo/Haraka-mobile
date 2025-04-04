package com.brayo.harakamall.repository

import com.brayo.harakamall.data.UserDao
import com.brayo.harakamall.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}