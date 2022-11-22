package com.farlan.foodrecipe.model

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.farlan.foodrecipe.R

class FoodRecipeAdapter(private val listFoodRecipe: ArrayList<FoodRecipe>) :
    RecyclerView.Adapter<FoodRecipeAdapter.CardViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: FoodRecipe)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgImage: ImageView = itemView.findViewById(R.id.img_item_images)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_food_recipe, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val foodRecipe = listFoodRecipe[position]

        Glide.with(holder.itemView.context)
            .load(foodRecipe.image)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgImage)

        holder.tvName.text = foodRecipe.name
        holder.tvDescription.text = foodRecipe.description
        holder.btnDetail.setOnClickListener {
            onItemClickCallback.onItemClicked(listFoodRecipe[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listFoodRecipe.size
    }
}