package com.example.may2905.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.may2905.OnItemClick
import com.example.may2905.Product
import com.example.may2905.databinding.ItemProductBinding

class ProductAdapter(
    private val productList:ArrayList<Product>,
    onItemClick: OnItemClick
):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    lateinit var adapterClick:OnItemClick
    var adapter=onItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.onBind(productList[position])
        holder.itemView.setOnClickListener({
            adapterClick.OnItemClick(productList[position])
        })
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun onBind(product: Product) {
            binding.textViewName.text = product.name
            Glide.with(binding.imageViewLogo).load(product.image).into(binding.imageViewLogo)
            binding.textViewAmount.text = product.amount
            binding.textViewDescription.text = product.description
            binding.textViewValue.text = product.value
        }

    }
}

