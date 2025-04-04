package com.vkcoders.shoppinglist

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindoo!", Toast.LENGTH_SHORT).show()

        val mainTextView = TextView(this)

        mainTextView.setText("Um Produto qualquer")


        setContentView(R.layout.activity_main)

        val findProductTitle : TextView = findViewById<TextView>(R.id.productTitle)
        findProductTitle.text = "Produto 01"

        val findProductDescription : TextView = findViewById<TextView>(R.id.productDescription)
        findProductDescription.text = "lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem"

        val findProductPrice: TextView = findViewById<TextView>(R.id.productPrice)
        findProductPrice.text = "19.50"
    }

}