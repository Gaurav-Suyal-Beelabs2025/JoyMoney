package com.example.joymoney

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PickUp_Adpter (private  val list: ArrayList<String>): RecyclerView.Adapter<PickUp_Adpter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itam_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return  list.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

}