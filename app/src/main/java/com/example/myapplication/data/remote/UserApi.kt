package com.example.myapplication.data.remote

import com.example.myapplication.data.model.User
import com.example.myapplication.data.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {
    @GET("people/")
    suspend fun getUsers() : Response<UserResponse>

    //@POST("api/people/${id}")
}