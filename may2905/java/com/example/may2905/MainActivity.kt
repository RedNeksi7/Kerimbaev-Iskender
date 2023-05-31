package com.example.may2905

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.example.may2905.adapter.ProductAdapter
import com.example.may2905.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnItemClick{
    lateinit var binding:ActivityMainBinding
    var arrayList:ArrayList<Product> = ArrayList()
    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(Product
            ("https://s0.rbk.ru/v6_top_pics/media/img/0/78/756801770042780.webp",
            "Молоко Простоквашино", "3%", "150", "50 сом"))
        arrayList.add(Product
            ("https://icf.listex.info/med/04924c54-7807-26b8-d1d3-5693d23d02a9.jpg",
            "Шоро Максым", "Без Алкогольный", "250", "60"))
        arrayList.add(Product
            ("https://neman.kg/images/watermarked/detailed/34/napitok-sierra-coca-cola-1-l-gazirovannyj-121-1.webp",
        "Coca-Cola", "0,5 Литр", "550",
            "45"))
        arrayList.add(Product
            ("https://kz.all.biz/img/kz/catalog/594360.JPG",
            "Кефир", "5%", "240", "65"))
        adapter=ProductAdapter(arrayList, this)
        binding.recyclerView.adapter=adapter
    }

    override fun OnItemClick(product: Product) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("image", product.image)
        intent.putExtra("name", product.name)
        intent.putExtra("description", product.description)
        intent.putExtra("amount", product.amount)
        intent.putExtra("value", product.value)
        startActivity(intent)
    }
}