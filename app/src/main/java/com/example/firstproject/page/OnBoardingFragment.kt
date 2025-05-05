package com.example.firstproject.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityOnboardingBinding

class OnBoardingFragment : Fragment() {

    private var binding: ActivityOnboardingBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityOnboardingBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.viewPager?.adapter = FragmentOnboardingAdapter(this)

        binding?.indicator?.setViewPager(binding!!.viewPager)

        binding?.button?.setOnClickListener {
            parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment.newInstance())
            .addToBackStack(MainFragment::class.java.name)
            .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        fun newInstance(): OnBoardingFragment {
            return OnBoardingFragment()
        }
    }
}