package com.example.firstproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityOnboardingBinding

class ThirdOnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding_third, container, false)
    }

    companion object {
        fun newInstance(): ThirdOnboardingFragment {
            return ThirdOnboardingFragment()
        }
    }

}