package com.example.firstproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.firstproject.databinding.ActivityOnboardingBinding
import me.relex.circleindicator.CircleIndicator3

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = fragmentOnboardingAdapter(this)

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager)


        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}