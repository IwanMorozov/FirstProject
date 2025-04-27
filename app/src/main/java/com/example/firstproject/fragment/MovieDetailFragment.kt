package com.example.firstproject.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityMovieDetailBinding

class MovieDetailFragment : Fragment() {

    private var binding: ActivityMovieDetailBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMovieDetailBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val movieId = arguments?.getString(ARG_MOVIE_ID)
            ?: throw IllegalStateException("Что-то не так")

        val movieTextView = view.findViewById<TextView>(R.id.godFather)
        movieTextView.text = movieId

        binding?.backButton?.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }


        val shareButton = view.findViewById<AppCompatButton>(R.id.shareButton)
        shareButton.setOnClickListener {
            val shareText = "Привет! Посмотри этот фильм: $movieId."
            share(shareText)
        }

        binding?.favoritesButton?.setOnClickListener {
            Toast.makeText(requireActivity(), "Функционал еще в разработке", Toast.LENGTH_SHORT)
                .show()
        }

    }

    private fun share(text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }

        val chooser = Intent.createChooser(intent, "Поделиться через: ")
        startActivity(chooser)

    }

    companion object {
        const val ARG_MOVIE_ID = "movie_id"

        fun newInstance(movieId: String): MovieDetailFragment {
            val fragment = MovieDetailFragment()
            val args = Bundle().apply {
                putString(ARG_MOVIE_ID, movieId)
            }
            fragment.arguments = args
            return fragment
        }
    }

}