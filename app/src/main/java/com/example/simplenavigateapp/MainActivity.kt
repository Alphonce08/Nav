package com.example.simplenavigateapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var home:Button
    lateinit var about:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        about = findViewById(R.id.btnabout)
        about.setOnClickListener {
            var intent = Intent(this, About::class.java)
            startActivity(intent)
        }

        home = findViewById(R.id.btnhome)
        home.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

