package com.borja.android.dogsapp

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.borja.android.dogsapp.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso


//7 ViewHolder
class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemDogsBinding.bind(view)

    fun bind(image:String){
        Log.d("PERRO", "IMAGEN PERRO $image")
        Picasso.get().load(image).into(binding.ivDogs)
    }
}