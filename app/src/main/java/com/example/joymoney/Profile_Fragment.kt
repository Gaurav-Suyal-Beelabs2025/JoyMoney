package com.example.joymoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController


class Profile_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_profile_, container, false)

        val profile = view.findViewById<ConstraintLayout>(R.id.profile_personaldetails)
     profile.setOnClickListener {
         it.findNavController().navigate(R.id.action_profile_Fragment_to_profile_details)
     }

        return view
    }

}