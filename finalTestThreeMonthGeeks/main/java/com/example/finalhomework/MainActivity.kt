package com.example.finalhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.finalhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter: CategoryAdapter
    lateinit var categoryRecyclerView: RecyclerView
    lateinit var binding:ActivityMainBinding

    lateinit var foodAdapter: FoodAdapter
    lateinit var foodRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAdapters()

    }
    private fun setCategory():ArrayList<Category>{
        return arrayListOf(
            Category(R.drawable.i340, "Takeaways"),
            Category(R.drawable.i341, "Grocery"),
            Category(R.drawable.i342, "Convenience"),
            Category(R.drawable.i343, "Pharmacy")
        )
    }

    private fun setFoods():ArrayList<Food>{
        return arrayListOf(
            Food(R.drawable.i322, "Burger Craze", "OPEN", R.drawable.i719, "1.5km away", R.drawable.i721, 4.6,"American Burgers")
        )
    }

    private fun setAdapters(){
        categoryAdapter= CategoryAdapter(setCategory())
        categoryRecyclerView.adapter=categoryAdapter
        categoryRecyclerView=binding.recyclerViewCategory

        foodAdapter= FoodAdapter(setFoods())
        foodRecyclerView=binding.recyclerViewFoods
        foodRecyclerView.adapter=foodAdapter
    }
}