package com.vkcoders.shoppinglist.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vkcoders.shoppinglist.R
import com.vkcoders.shoppinglist.model.Product
import com.vkcoders.shoppinglist.ui.recyclerview.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindoo!", Toast.LENGTH_SHORT).show()

        setContentView(R.layout.main_screen)

        val productsList : RecyclerView = findViewById<RecyclerView>(R.id.listProducts)

        productsList.adapter = ProductListAdapter(context = this, products = listOf(
            Product(
                    name = "Item 01",
                description = "teste teste teste 01",
                price = BigDecimal("29.99")
            ),
            Product(
                name = "Item 02",
                description = "teste teste teste 02",
                price = BigDecimal("89.57")
            ),
            Product(
                name = "Item 01",
                description = "teste teste teste 01",
                price = BigDecimal("29.99")
            ),
            Product(
                name = "Item 02",
                description = "teste teste teste 02",
                price = BigDecimal("89.57")
            ),
            Product(
                name = "Item 01",
                description = "teste teste teste 01",
                price = BigDecimal("29.99")
            ),
            Product(
                name = "Item 02",
                description = "teste teste teste 02",
                price = BigDecimal("89.57")
            ),

        ))
    }

}