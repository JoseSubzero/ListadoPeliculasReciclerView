package com.example.listadopeliculasreciclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadopeliculasreciclerview.Pelicula
import com.example.listadopeliculasreciclerview.R

class PeliculasAdapter (private val peliculaList: List<Pelicula>) : RecyclerView.Adapter<PeliculaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        // En vez de tener que recojer el contexto como parámetro lo puedo
        // coger de cualquiera de las vistas del layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculaViewHolder(layoutInflater.inflate(R.layout.item_peliculas, parent, false))
    }
    //Va a pasar por cada uno de lo item y va a llamar a la función render()
    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val item = peliculaList[position]
        holder.render(item)
    }

    //Devuelve el tamaño de la lista
    override fun getItemCount(): Int = peliculaList.size
}