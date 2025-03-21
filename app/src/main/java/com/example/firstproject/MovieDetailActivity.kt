package com.example.firstproject

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MovieDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val backButton = findViewById<ImageView>(R.id.backButton)

        backButton.setOnClickListener{
            finish()
        }
}}