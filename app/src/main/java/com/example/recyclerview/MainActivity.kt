package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val mahasiswaList = mutableListOf<ItemViewModel>()
        mahasiswaList.add(ItemViewModel("1217050146", "Yuda Ristian"))
        mahasiswaList.add(ItemViewModel("1217050121", "Ridwan Ahmad"))

        val adapter = MahasiswaAdapter(mahasiswaList)
        recyclerView.adapter = adapter
    }
}