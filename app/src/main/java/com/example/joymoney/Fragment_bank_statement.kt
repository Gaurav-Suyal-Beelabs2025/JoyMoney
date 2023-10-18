package com.example.joymoney

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog


class Fragment_bank_statement : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bank_statement, container, false)
        val alert = view.findViewById<TextView>(R.id.bankstatement_readdetails1)
        val dismiss=view.findViewById<TextView>(R.id.readetails_dismiss)


        alert.setOnClickListener {
            showAlertDialogButtonClicked()
            }



            // Do something with the data coming from the AlertDialog
            return view



    }


    fun showAlertDialogButtonClicked() {

        val builder = AlertDialog.Builder(context)
        // set the custom layout
        val customLayout: View = layoutInflater.inflate(R.layout.read_details_btn, null)
        builder.setView(customLayout)


        builder.setPositiveButton("") { dialog: DialogInterface?, which: Int ->
            // send data from the AlertDialog to the Activity

        }

        val dialog = builder.create()
        dialog.show()
        dialog.getWindow()?.setGravity(Gravity.BOTTOM)



    }
}