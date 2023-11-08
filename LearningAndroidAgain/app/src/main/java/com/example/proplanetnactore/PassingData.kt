package com.example.proplanetnactore

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView

class PassingData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data)

        val name= intent.getStringExtra(MainActivity.KEY);
        val getName = findViewById<TextView>(R.id.getName);
        getName.text= name.toString() +" , How are you pal ?";

        // Implicit Intent for Camera
        val cameraBtn = findViewById<Button>(R.id.camera);
        cameraBtn.setOnClickListener {
            val REQUEST_IMAGE_CAPTURE = 1
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            try {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            } catch (e: ActivityNotFoundException) {
                // display error state to the user
            }
        }
    }
}