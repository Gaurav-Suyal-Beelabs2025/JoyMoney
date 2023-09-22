package com.example.joymoney

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible

class AadharVerificationUpload : AppCompatActivity() {
    private val REQUEST_SELECT_IMAGE = 1
    private val REQUEST_SELECT_IMAGE1 = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aadhar_verification_upload)
        val uploadfront = findViewById<ConstraintLayout>(R.id.front_layout)
         val back=findViewById<ConstraintLayout>(R.id.back_layout)

        uploadfront.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE)
            startActivityForResult(cameraIntent, 1)
        }
        back.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE)
            startActivityForResult(cameraIntent, 2)
        }
    }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            if (requestCode == 1) {

                val photo: Bitmap = data?.extras?.get("data") as Bitmap
                var ImageView = findViewById<ImageView>(R.id.imagesave)


                var textView = findViewById<TextView>(R.id.uplaod_front1)
                var imageview = findViewById<ImageView>(R.id.up_image)


//for front camera
                textView.setVisibility(View.GONE);
                imageview.setVisibility(View.GONE);
                ImageView.setImageBitmap(photo)

            }
            else if (requestCode == 2) {
                val photo1: Bitmap = data?.extras?.get("data") as Bitmap
                var ImageView1 = findViewById<ImageView>(R.id.image_save1)

                var textView1 = findViewById<TextView>(R.id.upload_back)
                var imageview1 = findViewById<ImageView>(R.id.up_image1)
                textView1.setVisibility(View.GONE);
                imageview1.setVisibility(View.GONE);
                ImageView1.setImageBitmap(photo1)

            }

//  for back camera



            }

            }



