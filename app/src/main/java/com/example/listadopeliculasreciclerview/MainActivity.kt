package com.example.listadopeliculasreciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadopeliculasreciclerview.adapter.PeliculasAdapter
import com.example.listadopeliculasreciclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerPeliculas.layoutManager = manager
        binding.recyclerPeliculas.addItemDecoration(decoration)
        binding.recyclerPeliculas.layoutManager = LinearLayoutManager(this)
        binding.recyclerPeliculas.adapter = PeliculasAdapter(PeliculaProvider.peliculaList)

    }
}