package com.example.may2905

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.may2905.databinding.ActivityDetailBinding
import com.example.may2905.databinding.ItemProductBinding
import java.io.Serializable

class DetailActivity : AppCompatActivity() {
    lateinit var image:String
    lateinit var name:String
    lateinit var description:String
    lateinit var amount:String
    lateinit var value:String

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding = ActivityDetailBinding.inflate(layoutInflater)

        val intent = intent
        val name = intent.getStringExtra("name")
        val description=intent.getStringExtra("description")
        val amount=intent.getStringExtra("amount")
        val image=intent.getStringExtra("image")
        val value=intent.getStringExtra("value")

        binding.detailName.setText(name)

        val product:Product
        Glide.with(binding.detailImageView).load(product.image).into(binding.detailImageView)
        binding.detailDescription.setText(description)
        binding.detailAmount.setText(amount)
        binding.detailValue.setText(value)
    }
    private lateinit var binding:ActivityDetailBinding
}