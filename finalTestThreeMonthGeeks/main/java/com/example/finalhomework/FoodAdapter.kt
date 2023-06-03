package com.example.finalhomework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.finalhomework.databinding.ItemFoodsBinding

class FoodAdapter(var arraylist:ArrayList<Food>) :RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(
            ItemFoodsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.onBind(arraylist[position])
        holder.itemView.setOnClickListener({
            arraylist[position]
        })
    }

    inner class FoodViewHolder(val binding:ItemFoodsBinding):ViewHolder(binding.root){
        lateinit var image:ImageView
        lateinit var name:TextView
        lateinit var open:TextView
        lateinit var timeImage:ImageView
        lateinit var distance:TextView
        lateinit var star:ImageView
        lateinit var grade:TextView
        lateinit var countryOfFood:TextView

        private fun findViews(){
            image=binding.burgerlogo
            name=binding.textBurgerInfo
            open=binding.open
            timeImage=binding.time
            distance=binding.distance
            star=binding.star
            grade=binding.grade
            countryOfFood=binding.countryOfFood
        }

        fun setViews(food: Food){
            findViews()
            image.setImageResource(food.image)
            name.text=food.name
            open.text=food.open
            timeImage.setImageResource(food.timeImage)
            distance.text=food.distance
            star.setImageResource(food.starImage)
            grade.text= food.grade.toString()
            countryOfFood.text=food.countryOfFood
        }

        fun onBind(food: Food){
            findViews()
            setViews(food)
        }
    }
}