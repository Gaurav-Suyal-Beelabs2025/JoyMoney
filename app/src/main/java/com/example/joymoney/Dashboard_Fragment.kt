package com.example.joymoney

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard_, container, false)


        val fragmentReferences = view.findViewById<TextView>(R.id.home_txtresume)
        fragmentReferences.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_Fragment_to_fragment_references)

        }


        val Fragment_bank_statement = view.findViewById<TextView>(R.id.home_apply)
        Fragment_bank_statement.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_Fragment_to_fragment_bank_statement)

        }


        val recyclerView: RecyclerView = view.findViewById(R.id.home_recycler)
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val items = listOf(
            ClipData.Item("Item 1"),
            ClipData.Item("Item 2"),
            ClipData.Item("Item 3"),
            ClipData.Item("Item 4"),
            ClipData.Item("Item 5"),
            ClipData.Item("Item 6"),
            ClipData.Item("Item 7"),
            ClipData.Item("Item 8"),
            ClipData.Item("Item 9"),
            ClipData.Item("Item 10")
            // Add more items as needed
        )

        val adapter = Adapter_home(items)
        recyclerView.adapter = adapter



        return view
    }


}

