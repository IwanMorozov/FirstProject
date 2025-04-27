package com.example.firstproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityOnboardingBinding
import com.example.firstproject.fragmentOnboardingAdapter

class FirstOnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding_first, container, false)
    }

    companion object {
        fun newInstance(): FirstOnboardingFragment {
            return FirstOnboardingFragment()
        }
    }

}