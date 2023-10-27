package com.example.joymoney

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog

class Home_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home_, container, false)

    val upload_selfie=view.findViewById<TextView>(R.id.button_upload_selfie)
    val Aadhar_verification=view.findViewById<TextView>(R.id.button_Aadhar_verification)
    val Pan_verification=view.findViewById<TextView>(R.id.button_PAN_Verification)
    val Allow_Permission = view.findViewById<TextView>(R.id.button_allow_Permission)
    val Mobile_Number    = view.findViewById<TextView>(R.id.button_Mobile_Number)
    val Business_Details= view.findViewById<TextView>(R.id.button_business_Details)
    val Bank_Details   = view.findViewById<TextView>(R.id.button_bank_Details)
    val Wor_Details  = view.findViewById<TextView>(R.id.button_Work_Details)
    val Rent_Agreement =view.findViewById<TextView>(R.id.button_Rent_Agreement)
    val Residence_Details =view.findViewById<TextView>(R.id.button_Residence_Details)
    val add_comments=view.findViewById<TextView>(R.id.buttom_add_comments)
    val Reorder =view.findViewById<TextView>(R.id.buttom_Reorder)
    val raise_ticket =view.findViewById<TextView>(R.id.buttom_raise_ticket)
         upload_selfie.setOnClickListener {

        Navigation.findNavController(view).navigate(R.id.uploadSelfie_Fragment)

         }

        Aadhar_verification.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.aadharVerification_Captcha_Fragment)
        }

      Pan_verification.setOnClickListener {

          Navigation.findNavController(view).navigate(R.id.panVerification_Fragment)

      }

        Allow_Permission.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.allowPermission_Fragment)
        }

        Mobile_Number.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.mobileNumber_VerificationFragment)

        }

        Business_Details.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.business_Details_Fragment)

        }


        Bank_Details.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.bank_Details_Fragment)

        }



        Wor_Details.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.work_DetailsFragment)

        }


        Rent_Agreement.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.rent_AgreementFragment)

        }

        Residence_Details.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.residence_DetailsFragment
            )

        }

        add_comments.setOnClickListener {
            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.fragment_order__delivered_, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

        }

        Reorder.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.order_DetailsFragment)


        }

        raise_ticket.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.pick_Up_Fragment)
        }



        return view

    }

}