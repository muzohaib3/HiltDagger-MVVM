package com.informatica.hiltdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.informatica.hiltdagger.adapter.DataAdapter
import com.informatica.hiltdagger.data.api.Status
import com.informatica.hiltdagger.data.viewmodel.MainViewModel
import com.informatica.hiltdagger.databinding.ActivityMainBinding
import com.informatica.hiltdagger.ktx.obtainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        initObserver()
    }

    private fun initObserver(){

        viewModel.getPosts()
        viewModel.data.observe(this){
            when(it.status)
            {
                Status.LOADING->{}
                Status.SUCCESS->{
                    try
                    {
                        for (i in it.data!!.indices)
                        {
                            binding.rvList.apply {
                                layoutManager = LinearLayoutManager(this@MainActivity)
                                adapter = DataAdapter(this@MainActivity, it.data)
                            }
                        }
                        Log.i("response","data response >> ${it.data[0].body}")
                    }
                    catch (e:Exception)
                    {
                        Log.i("response","Exception >> ${e.message}")
                    }

                }
                Status.ERROR->{}
                else->{}
            }
        }

    }

}