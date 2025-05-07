package com.example.firstproject.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.firstproject.R
import com.example.firstproject.fragment.MovieDetailFragment
import com.example.firstproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.imageGodFather?.setOnClickListener {

            val movieDetailFragment = MovieDetailFragment.newInstance("The Godfather")

            parentFragmentManager.commit {
                replace(
                    R.id.fragment_container,
                    movieDetailFragment,
                    MovieDetailFragment::class.java.name
                )
                addToBackStack(null)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}