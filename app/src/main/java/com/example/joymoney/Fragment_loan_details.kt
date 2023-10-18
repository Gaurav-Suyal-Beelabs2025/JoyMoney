package com.example.joymoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController


class Fragment_loan_details : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_loan_details, container, false)


        val Loan_details = view.findViewById<TextView>(R.id.loan_detailss)
        Loan_details.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment_loan_details_to_employee_loan_details)

        }
            return view

    }
}