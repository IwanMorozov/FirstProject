package com.example.firstproject.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.firstproject.page.FragmentOnboardingAdapter
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityOnboardingBinding
import me.relex.circleindicator.CircleIndicator3

class OnBoardingFragment : Fragment() {

    private var binding: ActivityOnboardingBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityOnboardingBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = FragmentOnboardingAdapter(this)

        val indicator = view.findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment.Companion.newInstance())
                .addToBackStack(MainFragment::class.java.name)
                .commit()
        }
    }


    companion object {
        fun newInstance(): OnBoardingFragment {
            return OnBoardingFragment()
        }
    }
}