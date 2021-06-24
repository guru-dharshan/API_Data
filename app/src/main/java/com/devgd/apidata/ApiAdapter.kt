package com.devgd.apidata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
internal class ApiAdapter(private var apidata: List<ApiModelClass>) :
    RecyclerView.Adapter<ApiAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.textv1)
        var title1: TextView = view.findViewById(R.id.textv2)
        var title2: TextView = view.findViewById(R.id.textv3)
        var title3: TextView = view.findViewById(R.id.textv4)
        var title4: TextView = view.findViewById(R.id.textv5)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_layout, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = apidata[position]
        holder.title.setText(data.getTitle())
        holder.title1.setText(data.getTitle1())
        holder.title2.setText(data.getTitle2())
        holder.title3.setText(data.getTitle3())
        holder.title4.setText(data.getTitle4())
    }
    override fun getItemCount(): Int {
        return apidata.size
    }
}