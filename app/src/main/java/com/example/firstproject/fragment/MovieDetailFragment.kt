package com.example.firstproject.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.firstproject.R
import com.example.firstproject.databinding.ActivityMovieDetailBinding

class MovieDetailFragment : Fragment(R.layout.activity_movie_detail) {

    private var _binding: ActivityMovieDetailBinding? = null
    private val binding get() = _binding!!
    private val args: MovieDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivityMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val movieId = args.movieId

        binding.godFather.text = movieId


        binding.backButton.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }


        binding.shareButton.setOnClickListener {
            val shareText = "Привет! Посмотри этот фильм: $movieId."
            share(shareText)
        }

        binding.favoritesButton.setOnClickListener {
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}