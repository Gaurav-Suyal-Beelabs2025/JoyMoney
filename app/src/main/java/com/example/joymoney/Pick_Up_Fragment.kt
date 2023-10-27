package com.example.joymoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class Pick_Up_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_pick__up_, container, false)


        val data = ArrayList<String>()

        for(item in 1..25){
            data.add("")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycler_pickup)
        val adapter=PickUp_Adpter(data)
        recyclerview.adapter=adapter







        return view
    }


}