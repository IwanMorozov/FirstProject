package com.example.firstproject.page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstproject.R
import com.example.firstproject.data.Movie
import com.example.firstproject.data.ViewHolderMovie

class MovieAdapter(
    private val movies: List<Movie>,
    private val onItemClick: (Movie) -> Unit
) : RecyclerView.Adapter<ViewHolderMovie>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovie {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolderMovie(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMovie, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
        holder.itemView.setOnClickListener {
            onItemClick(movie)
        }
    }

    override fun getItemCount(): Int = movies.size
}