package com.example.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val godFather = findViewById<ImageView>(R.id.imageGodFather)

        godFather.setOnClickListener {
            val intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtra("movie_id", "The Godfather")
            startActivity(intent)
        }
    }

}