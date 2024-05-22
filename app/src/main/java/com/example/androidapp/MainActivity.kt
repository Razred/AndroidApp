package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weatherButton: Button = findViewById(R.id.weatherButton)
        val feedbackButton: Button = findViewById(R.id.feedbackButton)

        weatherButton.setOnClickListener {
            startActivity(Intent(this, ApiDataActivity::class.java))
        }

        feedbackButton.setOnClickListener {
            startActivity(Intent(this, FeedbackActivity::class.java))
        }
    }
}