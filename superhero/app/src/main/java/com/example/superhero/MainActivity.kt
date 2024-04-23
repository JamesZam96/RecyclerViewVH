package com.example.superhero

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.annotation.MainThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superhero.adapter.RecyclerViewAdapter
import com.example.superhero.adapter.RecyclerViewAdapterH
import com.example.superhero.data.DataSource
import com.example.superhero.databinding.ActivityMainBinding
import com.example.superhero.model.Superhero

class MainActivity : AppCompatActivity() {
    /*val batman: Superhero = Superhero("Batman","DC","Bruce Wayne","https://i0.wp.com/www.michigandaily.com/wp-content/uploads/2023/06/Untitled_Artwork-116.png?fit=2400%2C1600&ssl=1")
    val nameBatman = batman.realName*/
    private lateinit var binding: ActivityMainBinding
    lateinit var myRecycler:RecyclerView
    val myAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    val myAdapterH: RecyclerViewAdapterH = RecyclerViewAdapterH()
    //var superheros: MutableList<Superhero> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadRecyclerH()
        loadRecycler()
       /*superheros.add(Superhero("Spiderman","Marvel","Peter Parker",""))
        superheros.add(Superhero("Daredevil","Marvel","Matthew",""))
        superheros.add(Superhero("Wolverine","Marvel","James",""))
        superheros.add(Superhero("Thor","Marvel","Thor Odinson",""))
        superheros.add(Superhero("Flash","DC","Jay Garrick",""))*/

        /*binding.name1.text = batman.name
        binding.realName1.text = batman.realName
        binding.publisher1.text = batman.publisher
        Glide.with(this).load(batman.photo).into(binding.photo1)*/
    }
    fun loadRecycler(){
        myRecycler = binding.recyclerViewSuperhero
        myRecycler.setHasFixedSize(true)
        myRecycler.layoutManager = LinearLayoutManager(this)
        myAdapter.RecyclerViewAdapter(DataSource().getSuperhero(),this)
        myRecycler.adapter = myAdapter
    }

    fun loadRecyclerH(){
        myRecycler = binding.recyclerViewSuperheroH
        myRecycler.setHasFixedSize(true)
        myRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        myAdapterH.RecyclerViewAdapterH(DataSource().getSuperhero(),this)
        myRecycler.adapter = myAdapterH
    }
}