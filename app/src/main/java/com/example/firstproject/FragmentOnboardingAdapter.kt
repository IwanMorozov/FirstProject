package com.example.firstproject

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.firstproject.fragment.FirstOnboardingFragment
import com.example.firstproject.fragment.OnBoardingActivityFragment
import com.example.firstproject.fragment.SecondOnboardingFragment
import com.example.firstproject.fragment.ThirdOnboardingFragment
import java.lang.IllegalArgumentException

class FragmentOnboardingAdapter(fragmentActivity: OnBoardingActivityFragment) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstOnboardingFragment.newInstance()
            1 -> SecondOnboardingFragment.newInstance()
            2 -> ThirdOnboardingFragment.newInstance()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}