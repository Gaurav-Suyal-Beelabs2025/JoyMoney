package com.example.joymoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class AadharVerification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aadhar_verification)

        val openBottomSheet = findViewById<TextView>(R.id.verifi_button)
        openBottomSheet.setOnClickListener {

            // adding on click listener for our button
            // on below line we are creating a new bottom sheet dialog.
            val dialog = BottomSheetDialog(this)

            // on below line we are inflating a layout file which we have created.
            val view = layoutInflater.inflate(R.layout.congurlation_layout, null)
            val btnClose = view.findViewById<TextView>(R.id.dismiss_button)
            // on below line we are creating a variable for our button
            // which we are using to dismiss our dialog.
            btnClose.setOnClickListener {
                // on below line we are calling a dismiss
                // method to close our dialog.
                dialog.dismiss()
            }
            //
            // on below line we are adding on click listener
            // for our dismissing the dialog button.

            // below line is use to set cancelable to avoid
            // closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)

            // on below line we are setting
            // content view to our view.
            dialog.setContentView(view)

            // on below line we are calling
            // a show method to display a dialog.
            dialog.show()



        }

    }
}