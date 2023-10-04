package com.example.joymoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val navController = findNavController(R.id.activity_main_nav_host_fragment1)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_botton)
        bottomNavigationView.setupWithNavController(navController)


        navController.addOnDestinationChangedListener { _, destination, _ ->


            if (destination.id == R.id.uploadSelfie_Fragment) {
                bottomNavigationView.visibility = View.GONE
            } else if (destination.id == R.id.aadharVerification_Captcha_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.panVerification_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.allowPermission_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.aadharVerification_Captcha_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.mobileNumber_VerificationFragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.business_Details_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.bank_Details_Fragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.work_DetailsFragment) {
                bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.rent_AgreementFragment) {
                    bottomNavigationView.visibility = View.GONE

            } else if (destination.id == R.id.residence_DetailsFragment) {
                bottomNavigationView.visibility = View.GONE



                } else {

                bottomNavigationView.visibility = View.VISIBLE
            }


        }

    }



        }
