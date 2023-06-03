package com.example.finalhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalhomework.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    lateinit var food: Food

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    private fun setViews(){
        binding.logoFoodDetail.setImageResource(food.image)
        binding.title.text=food.name
        binding.gradeDetail.text= food.grade.toString()
        binding.star.setImageResource(food.starImage)
        binding.countryOfFood.text=food.countryOfFood
    }
}