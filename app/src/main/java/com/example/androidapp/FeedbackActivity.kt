package com.example.androidapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val feedbackEditText: EditText = findViewById(R.id.feedbackEditText)
        val submitFeedbackButton: Button = findViewById(R.id.submitFeedbackButton)

        submitFeedbackButton.setOnClickListener {
            val feedback = feedbackEditText.text.toString()
            if (feedback.isNotEmpty()) {
                // Здесь можно сохранить отзыв в базе данных
                Toast.makeText(this, "Спасибо за ваш отзыв!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Пожалуйста, введите отзыв", Toast.LENGTH_SHORT).show()
            }
        }
    }
}