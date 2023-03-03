package com.informatica.hiltdagger.data.repository

import com.informatica.hiltdagger.data.routes.UserModel

interface GeneralRepositoryImpl {

    suspend fun getPost(): List<UserModel>
}