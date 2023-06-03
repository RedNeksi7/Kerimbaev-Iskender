package com.example.finalhomework

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.finalhomework.databinding.CategoryBinding

class CategoryAdapter(var arraylist:ArrayList<Category>) :RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder (
        CategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.onBind(arraylist[position])
    }

    inner class CategoryViewHolder(var binding:CategoryBinding):ViewHolder(binding.root){
        private lateinit var image : ImageView
        lateinit var title : TextView

        private fun findViews(){
            image = binding.categoryHamburger
            title = binding.textViewName
        }

        fun onBind(category: Category) {
            findViews()
            image.setImageResource(category.image)
            title.text = category.name
        }
    }
}
