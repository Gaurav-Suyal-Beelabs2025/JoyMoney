package com.example.joymoney

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        val uploadadhar=findViewById<Button>(R.id.upload_Adhar_button)
        val bankstatment=findViewById<Button>(R.id.bank_statement_button)

//        val credit=findViewById<Button>(R.id.credit_money_button)


        val spash=findViewById<Button>(R.id.splash_button)

        val security=findViewById<Button>(R.id.security_button)
        text.setOnClickListener {
            val intent = Intent(this, Tablayout::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent = Intent(this, BusinessDetails::class.java)
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
        uploadadhar.setOnClickListener {
            val intent = Intent(this, AadharVerificationUpload::class.java)
            startActivity(intent)
        }

        bankstatment.setOnClickListener {
            val intent = Intent(this, BankStatement::class.java)
            startActivity(intent)
        }

//       credit.setOnClickListener {
//            val intent = Intent(this, BankStatementCredit::class.java)
//            startActivity(intent)
//        }
    }
}