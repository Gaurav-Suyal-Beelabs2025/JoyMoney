package com.example.joymoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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






    }
}