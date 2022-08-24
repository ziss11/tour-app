package com.example.dicoding_pemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val pageTitle = "Tourist Attractions"

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Tour> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = pageTitle

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(TourObject.listTour)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListTourAdapter(list)
        rvFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListTourAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Tour) {
                gotoDetailActivity(data)
            }
        })
    }

    private fun gotoDetailActivity(food: Tour) {
        val moveToDetailActivity = Intent(this@MainActivity, DetailActivity::class.java)

        moveToDetailActivity.putExtra(DetailActivity.EXTRA_ID, food.id)
        this.startActivity(moveToDetailActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_about -> {
                val gotoAboutActivity = Intent(this@MainActivity, AboutActivity::class.java)
                this.startActivity(gotoAboutActivity)
            }
        }
    }
}