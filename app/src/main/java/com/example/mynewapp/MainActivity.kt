package com.example.mynewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import layout.Adopter_class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val data = ArrayList<String>()

        for(item in 1..25){
            data.add("")
        }

        val recyclerview = findViewById<RecyclerView>(R.id.recycler)
        val adapter=Adopter_class(data)
        recyclerview.adapter=adapter


    }
}