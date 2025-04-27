package com.example.firstproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.page.OnBoardingFragment

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, OnBoardingFragment.newInstance())
                .commit()
        }
    }
}