package com.example.dicoding_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    private val pageTitle = "Tour Detail"

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_CITY = "extra_city"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = pageTitle

        val tvTourName: TextView = findViewById(R.id.tv_tour_name)
        val tourImage: ImageView = findViewById(R.id.img_tour_photo)
        val tvDetail: TextView = findViewById(R.id.tv_tour_detail)
        val tvCity: TextView = findViewById(R.id.tv_tour_city)

        val name = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getIntExtra(EXTRA_IMAGE, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val city = intent.getStringExtra(EXTRA_CITY)

        tvTourName.text = name!!.trim()
        tourImage.setImageResource(image)
        tvDetail.text = detail!!.trim()
        tvCity.text = city!!.trim()
    }
}