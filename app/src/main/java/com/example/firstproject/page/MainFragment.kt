package com.example.firstproject.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.firstproject.R
import com.example.firstproject.data.Movie
import com.example.firstproject.databinding.FragmentMainBinding

class
MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = GridLayoutManager(context, 2)

        val movies = listOf(
            Movie("inception", R.drawable.ic_inception),
            Movie("the dark knight", R.drawable.ic_dark_knight),
            Movie("matrix", R.drawable.ic_matrix),
            Movie("the godfather", R.drawable.ic_godfather),
            Movie("pulp fiction", R.drawable.ic_pulp_fiction),
            Movie("fight club", R.drawable.ic_fight_club)
        )

        val adapter = MovieAdapter(movies) { movie ->
            val action = MainFragmentDirections.actionMainToMovieDetail(movie.id)
            findNavController().navigate(action)
        }

        binding.recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}