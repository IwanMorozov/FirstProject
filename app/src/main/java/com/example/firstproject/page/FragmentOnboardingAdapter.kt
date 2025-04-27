package com.example.firstproject.page

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.firstproject.fragment.FirstOnboardingFragment
import com.example.firstproject.fragment.SecondOnboardingFragment
import com.example.firstproject.fragment.ThirdOnboardingFragment

class FragmentOnboardingAdapter(fragmentActivity: OnBoardingFragment) :
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