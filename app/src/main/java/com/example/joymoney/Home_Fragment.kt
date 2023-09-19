package com.example.joymoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation

class Home_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home_, container, false)

    val upload_selfie=view.findViewById<TextView>(R.id.button_upload_selfie)


         upload_selfie.setOnClickListener {

        Navigation.findNavController(view).navigate(R.id.uploadSelfie_Fragment)

         }




        return view

    }

}