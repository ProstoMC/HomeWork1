package com.example.homework1

import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_recipe.*

class RecipeActivity : AppCompatActivity() {

    val nameKey = "NAME_KEY"
    val imageidKey = "IMAGEID_KEY"
    val textKey = "TEXT_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
        imageView.setImageResource(R.drawable.naggets)


    }
}

