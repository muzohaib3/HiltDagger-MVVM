package com.informatica.hiltdagger.data.api

import com.informatica.hiltdagger.data.routes.Routes.Endpoints.posts
import com.informatica.hiltdagger.data.routes.UserModel
import retrofit2.http.GET

interface ApiService
{
    @GET(posts)
    suspend fun getPost():List<UserModel>
}