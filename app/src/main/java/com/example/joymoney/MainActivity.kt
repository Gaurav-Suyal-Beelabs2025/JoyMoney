package com.example.joymoney

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text=findViewById<Button>(R.id.tab)
        val button=findViewById<Button>(R.id.next)
        val button1=findViewById<Button>(R.id.next1)
        val aadhar=findViewById<Button>(R.id.adhar)

        val spash=findViewById<Button>(R.id.splash_button)

        val security=findViewById<Button>(R.id.security_button)
        text.setOnClickListener {
            val intent = Intent(this, Tablayout::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent = Intent(this, BussnessDetails::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent = Intent(this, BussnessDetailsUntick::class.java)
            startActivity(intent)
        }
        aadhar.setOnClickListener {
            val intent = Intent(this, AadharVerification::class.java)
            startActivity(intent)
        }

        security.setOnClickListener {
            val intent = Intent(this, Security::class.java)
            startActivity(intent)
        }

        spash.setOnClickListener {
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }
    }
}