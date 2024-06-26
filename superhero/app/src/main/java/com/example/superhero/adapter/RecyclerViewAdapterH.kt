package com.example.superhero.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superhero.R
import com.example.superhero.model.Superhero

class RecyclerViewAdapterH: RecyclerView.Adapter<RecyclerViewAdapterH.ViewHolder>() {
    var superheros: MutableList<Superhero> = ArrayList()
    lateinit var context: Context
    lateinit var myListener: OnItemClickListener
    fun RecyclerViewAdapterH(superhero: MutableList<Superhero>, context: Context) {
        this.superheros = superhero
        this.context = context
    }

    class ViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view) {
        val superheroName = view.findViewById<TextView>(R.id.name1)
        val superheroRealName = view.findViewById<TextView>(R.id.realName1)
        val superheroPublisher = view.findViewById<TextView>(R.id.publisher1)
        val superheroPhoto = view.findViewById<ImageView>(R.id.photo1)
        fun bind(superhero: Superhero, context: Context) {
            superheroName.text = superhero.name
            superheroRealName.text = superhero.realName
            superheroPublisher.text = superhero.publisher
            superheroPhoto.loadImage(superhero.photo)

        }
        fun ImageView.loadImage(url: String){
            Glide.with(context).load(url).into(this)
        }

        init{
            view.setOnClickListener {
                listener.OnItemClickListener(bindingAdapterPosition)
            }
        }
    }

    interface OnItemClickListener{
        fun OnItemClickListener(position: Int)

    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        myListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false),myListener)
    }

    override fun getItemCount(): Int {
        return superheros.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = superheros.get(position)
        //holder.bindingAdapterPosition
        holder.bind(item,context)
    }
}