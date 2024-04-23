package com.example.superhero

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.superhero.databinding.ActivityDetailsuperheroBinding
import com.example.superhero.databinding.ActivityMainBinding
import java.net.URI

class detailsuperhero : AppCompatActivity() {
    lateinit var binding: ActivityDetailsuperheroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsuperheroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name: String = intent.getStringExtra("name").toString()
        binding.nameSuperhero.text = name
        val realName: String = intent.getStringExtra("realName").toString()
        binding.realNameSuperhero.text = realName
        val publisher: String = intent.getStringExtra("publisher").toString()
        binding.publisherSuperhero.text = publisher
        val photo = intent.getStringExtra("photo")
        if (photo != null) {
            binding.photoSuperhero.loadImage(photo)
        }
    }

    fun ImageView.loadImage(url: String){
        Glide.with(context).load(url).into(this)
    }
}
