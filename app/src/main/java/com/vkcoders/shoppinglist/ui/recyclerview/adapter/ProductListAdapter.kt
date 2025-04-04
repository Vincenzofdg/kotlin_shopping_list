package com.vkcoders.shoppinglist.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vkcoders.shoppinglist.R
import com.vkcoders.shoppinglist.model.Product

class ProductListAdapter(
    private val products: List<Product>,
    private val context: Context
) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindProduct(product: Product) {
            val name = itemView.findViewById<TextView>(R.id.productTitle)
            val description = itemView.findViewById<TextView>(R.id.productDescription)
            val price = itemView.findViewById<TextView>(R.id.productPrice)

            name.text = product.name
            description.text = product.description
            price.text = product.price.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.bindProduct(product)
    }
}
