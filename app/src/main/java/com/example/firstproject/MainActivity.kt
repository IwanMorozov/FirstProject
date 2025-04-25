package com.example.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.fragment.OnBoardingActivityFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,OnBoardingActivityFragment.newInstance())
                .commit()
        }else {
            recreate()
        }

        val godFather = findViewById<ImageView>(R.id.imageGodFather)

        godFather.setOnClickListener {
            val intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtra(MovieDetailActivity.ARG_MOVIE_ID, "The Godfather")
            startActivity(intent)
        }
    }

}