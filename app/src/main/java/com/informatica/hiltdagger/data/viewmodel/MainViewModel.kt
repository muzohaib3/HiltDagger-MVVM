package com.informatica.hiltdagger.data.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.informatica.hiltdagger.data.api.ApiResponseCallback
import com.informatica.hiltdagger.data.repository.GeneralRepositoryImpl
import com.informatica.hiltdagger.data.routes.UserModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject public constructor(
    private var appRepository: GeneralRepositoryImpl
): ViewModel()
{

    private val _data = MutableLiveData<ApiResponseCallback<List<UserModel>>>()
    val data: LiveData<ApiResponseCallback<List<UserModel>>>
        get() = _data

    fun getPosts(){
        viewModelScope.launch {
            try {
                _data.value = ApiResponseCallback.success(
                    appRepository.getPost()
                )
                Log.i("viewModel","Response found")
            }
            catch (e: Exception)
            {
                _data.value = ApiResponseCallback.error(null)
                Log.i("viewModel", "${e.message}")
            }
        }
    }
}