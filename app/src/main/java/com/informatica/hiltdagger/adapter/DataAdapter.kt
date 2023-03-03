package com.informatica.hiltdagger.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.informatica.hiltdagger.R
import com.informatica.hiltdagger.data.routes.UserModel
import com.informatica.hiltdagger.databinding.ListViewTypeBinding

class DataAdapter(
    private val context: Context,
    private val list:List<UserModel>
) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ListViewTypeBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view_type, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data= list[position]
        with(holder){
            binding.tvId.text = data.id.toString()
            binding.tvbody.text = data.title
            binding.tvtitle.text = data.id.toString()
        }
    }
    //
    override fun getItemCount(): Int = list.size
}