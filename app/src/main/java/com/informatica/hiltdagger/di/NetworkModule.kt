package com.informatica.hiltdagger.di

import android.content.Context
import com.informatica.hiltdagger.data.routes.Routes
import com.informatica.hiltdagger.data.api.ApiService
import com.informatica.hiltdagger.utils.LoginPrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

class NetworkModule {

    @Module
    @InstallIn(SingletonComponent::class)
    class RepositoryModule {

        @Singleton
        @Provides
        fun provideRetrofit(): Retrofit {
            var retrofit: Retrofit? = null
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(Routes.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }

        @Singleton
        @Provides
        fun provideAppServices(retrofit: Retrofit): ApiService {
            return retrofit.create(ApiService::class.java)
        }

    }
}