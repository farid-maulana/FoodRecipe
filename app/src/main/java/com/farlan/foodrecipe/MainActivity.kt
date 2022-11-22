package com.farlan.foodrecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farlan.foodrecipe.`object`.FoodRecipeData
import com.farlan.foodrecipe.model.FoodRecipe
import com.farlan.foodrecipe.model.FoodRecipeAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoodRecipe: RecyclerView
    private var list: ArrayList<FoodRecipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoodRecipe = findViewById(R.id.rvFoodRecipe)
        rvFoodRecipe.setHasFixedSize(true)

        list.addAll(FoodRecipeData.listData)
        showRecylcerList()
    }

    private fun showRecylcerList() {
        rvFoodRecipe.layoutManager = LinearLayoutManager(this)
        val foodRecipeAdapter = FoodRecipeAdapter(list)
        rvFoodRecipe.adapter = foodRecipeAdapter

        foodRecipeAdapter.setOnItemClickCallback(object : FoodRecipeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: FoodRecipe) {
                showSelectedFoodRecipe(data)
            }
        })
    }

    private fun showSelectedFoodRecipe(data: FoodRecipe) {
        Toast.makeText(this, data.name, Toast.LENGTH_SHORT).show()
    }
}