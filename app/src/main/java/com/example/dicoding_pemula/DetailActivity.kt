package com.example.dicoding_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.dicoding_pemula.TourObject.listTour

class DetailActivity : AppCompatActivity() {
    private val pageTitle = "Tour Detail"

    private lateinit var tvTourName: TextView
    private lateinit var tourImage: ImageView
    private lateinit var tvDetail: TextView
    private lateinit var tvCity: TextView

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = pageTitle

        tvTourName = findViewById(R.id.tv_tour_name)
        tourImage = findViewById(R.id.img_tour_photo)
        tvDetail = findViewById(R.id.tv_tour_detail)
        tvCity = findViewById(R.id.tv_tour_city)

        val tourId = intent.getIntExtra(EXTRA_ID, 0)
        val result = listTour.find { it.id == tourId }

        tvTourName.text = result?.name?.trim()
        tourImage.setImageResource(result?.photo ?: 0)
        tvDetail.text = result?.detail?.trim()
        tvCity.text = result?.city?.trim()
    }
}