package com.example.firstproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.databinding.ActivityMainBinding
import com.example.firstproject.page.OnBoardingFragment

class AppActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, OnBoardingFragment.newInstance())
                .commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}