package com.example.myapplication.data.repository

import android.util.Log
import com.example.myapplication.data.model.User
import com.example.myapplication.data.model.UserResponse
import com.example.myapplication.data.remote.UserApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(private val api: UserApi){
    fun getUsers(): Flow<Response<UserResponse>> = flow {
        val response = api.getUsers()
        emit(response)
    }. catch { e ->
        Log.e("UserRepository","Error fetching getUsers ${e.message}")
    }

}