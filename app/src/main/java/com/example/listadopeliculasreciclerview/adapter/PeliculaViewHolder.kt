package com.example.listadopeliculasreciclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadopeliculasreciclerview.Pelicula
import com.example.listadopeliculasreciclerview.R
import com.example.listadopeliculasreciclerview.databinding.ItemPeliculasBinding
import com.google.android.material.snackbar.Snackbar

class PeliculaViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val b = ItemPeliculasBinding.bind(view)
    fun render(PeliculaModel: Pelicula){
        b.tvPeliculaNombre.text = PeliculaModel.Pelicula
        b.tvDirectorNombre.text = PeliculaModel.Director
        b.tvDistribuidoraNombre.text = PeliculaModel.Distribuidora
        Glide.with(b.ivPelicula.context)
            .load(PeliculaModel.Imagen)
            .error(R.drawable.error)
            .into(b.ivPelicula)
        b.ivPelicula.setOnClickListener {
            Snackbar.make(b.ivPelicula, PeliculaModel.Director, Snackbar.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Snackbar.make(b.ivPelicula, PeliculaModel.Pelicula, Snackbar.LENGTH_SHORT).show()
        }
    }
}