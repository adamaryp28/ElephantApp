package com.example.elephantapp.utils

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.elephantapp.R
import com.example.elephantapp.model.elephant
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_elephant.view.*

class AdapterElephants() : RecyclerView.Adapter<AdapterElephants.ViewHolder>(){

    lateinit var items: ArrayList<elephant>
    //NULL ESTO ;(
    override fun getItemCount(): Int {
        return if(::items.isInitialized){
            items.size
        }else{
            0
        }

    }
    fun setElephants(items: List<elephant>) {
        this.items = items as ArrayList<elephant>
        notifyDataSetChanged()
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_elephant, parent, false))

    // Binds each item in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model= items[position]
        holder.elephantName.text = "Nombre: ${model.nombre}"
        Picasso.get()
            .load(model.url)
            .into( holder.elephantImage)
    }
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each picture to
        val elephantName: TextView = view.size_info
        val elephantImage: ImageView = view.elephant_image
    }
}