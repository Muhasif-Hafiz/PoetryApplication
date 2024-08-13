package com.muhasib.mypoetry

import DataEntry
import RvAdapter
import SampleData
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhasib.mypoetry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private var poemList = ArrayList<DataEntry>()
    private val rvAdapter by lazy {
        RvAdapter(this,poemList)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        poemList.addAll(SampleData.data)

        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.adapter=rvAdapter



        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this, AddEditActivity::class.java))
        }
    }

}