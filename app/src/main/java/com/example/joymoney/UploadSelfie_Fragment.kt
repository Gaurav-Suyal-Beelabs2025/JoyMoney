package com.example.joymoney

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class UploadSelfie_Fragment : Fragment() {

     private val REQUEST_CODE = 123
     private lateinit var imageView: ImageView
     private lateinit var btnTakePicture: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_upload_selfie_, container, false)

        val imageView=view.findViewById<ImageView>(R.id.imageview)

           imageView.setOnClickListener {

               val takePictureIntent =  Intent(MediaStore.ACTION_IMAGE_CAPTURE)
               startActivityForResult(takePictureIntent, REQUEST_CODE)


           }




    return view
    }




}