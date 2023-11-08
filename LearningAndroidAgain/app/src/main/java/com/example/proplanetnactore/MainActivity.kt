package com.example.proplanetnactore

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // creating key
    companion object{
        const val KEY = "com.example.proplanetnactore.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        supportActionBar?.hide(); // Hides the Action Bar in Application.
        // Handler postdelayed is used for splash screen
//        Handler(Looper.getMainLooper()).postDelayed({
//            val intent = Intent(applicationContext, AboutMe::class.java);
//            startActivity(intent);
//        }, 5000)

        val layout = findViewById<LinearLayout>(R.id.linear);
        var dark = true;
        val darkModeBtn = findViewById<Button>(R.id.lightMode);
        darkModeBtn.setOnClickListener {
            if (dark == true){
                layout.setBackgroundResource(R.color.white);
                dark = false;
            } else {
                layout.setBackgroundResource(R.color.black);
                dark = true;
            }
        }
        val intentBtn = findViewById<Button>(R.id.intentBtn);
        intentBtn.setOnClickListener {
            intent = Intent(applicationContext, AboutMe::class.java)
            startActivity(intent)
        }

        val enterName = findViewById<EditText>(R.id.name);
        val submitName = findViewById<Button>(R.id.submitName);
        submitName.setOnClickListener {
            val message = "Hello " + enterName.text.toString();
            intent = Intent(this, PassingData::class.java)
            intent.putExtra(KEY, message)
            startActivity(intent)
        }
    }
}