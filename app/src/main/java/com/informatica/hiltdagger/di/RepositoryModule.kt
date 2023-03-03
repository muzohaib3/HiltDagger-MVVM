package com.informatica.hiltdagger.di

import com.informatica.hiltdagger.data.api.ApiService
import com.informatica.hiltdagger.data.repository.GeneralRepository
import com.informatica.hiltdagger.data.repository.GeneralRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Singleton

@DelicateCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(apiService: ApiService): GeneralRepositoryImpl {
        return GeneralRepository(apiService)
    }

}