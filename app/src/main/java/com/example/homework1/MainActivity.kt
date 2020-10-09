package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.content.Intent as AndroidContentIntent
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import android.app.Activity
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    var CHECKBOX_RESULT= 0
    fun showNuggets (view: View){
        val intent = AndroidContentIntent (this, RecipeActivity::class.java)
        startActivity(intent)
        //Toast.makeText(this, "NUGGETS BUTTON ON", Toast.LENGTH_SHORT).show()
    }
}