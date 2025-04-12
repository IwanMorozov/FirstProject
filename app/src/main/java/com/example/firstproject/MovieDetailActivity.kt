package com.example.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MovieDetailActivity : AppCompatActivity() {

    companion object{
        const val ARG_MOVIE_ID = "movie_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        val movieId = intent.getStringExtra(ARG_MOVIE_ID) ?: throw IllegalStateException()
        val movieTextView = findViewById<TextView>(R.id.godFather)
        movieTextView.text = movieId

        val backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        val favoriteButton = findViewById<AppCompatButton>(R.id.favoritesButton)
        favoriteButton.setOnClickListener {
            Toast.makeText(this, "Функционал еще в разработке", Toast.LENGTH_SHORT).show()
        }

        val shareButton = findViewById<AppCompatButton>(R.id.shareButton)
        shareButton.setOnClickListener {
            val shareText = "Привет! Посмотри этот фильм: $movieId."
            share(shareText)
        }
    }

    private fun share(text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        val chooser = Intent.createChooser(intent, "Поделиться через:")
        startActivity(chooser)
    }
}