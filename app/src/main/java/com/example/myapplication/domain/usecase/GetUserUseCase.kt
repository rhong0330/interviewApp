package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.User
import com.example.myapplication.data.model.UserResponse
import com.example.myapplication.data.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class GetUserUseCase @Inject constructor(private val repository: UserRepository){
    operator fun invoke(): Flow<Response<UserResponse>> = repository.getUsers()
}