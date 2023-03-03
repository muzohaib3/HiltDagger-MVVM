package com.informatica.hiltdagger.data.repository

import com.informatica.hiltdagger.data.routes.UserModel
import com.informatica.hiltdagger.data.api.ApiService
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi

class GeneralRepository @Inject constructor(
    private val apiService: ApiService
) :GeneralRepositoryImpl {
    override suspend fun getPost(): List<UserModel> = apiService.getPost()
}