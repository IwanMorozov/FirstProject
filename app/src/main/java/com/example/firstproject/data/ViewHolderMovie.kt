package com.example.firstproject.data

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstproject.R

class ViewHolderMovie(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView: ImageView = itemView.findViewById(R.id.imageGodFather)

    fun bind(movie: Movie) {
        imageView.setImageResource(movie.imageRes)
    }
}