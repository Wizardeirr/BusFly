package com.volkankelleci.busfly

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.volkankelleci.busfly.repo.UserRepository
import com.volkankelleci.busfly.room.User
import com.volkankelleci.busfly.room.UserDataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BaseViewModel(private val userRepository: UserRepository) : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    fun getUsers() {
        viewModelScope.launch {
            _users.value = userRepository.getAllUsers()
        }
    }

    fun insertUser(user: User) {
        viewModelScope.launch {
            userRepository.insertUser(user)
        }
    }
}
