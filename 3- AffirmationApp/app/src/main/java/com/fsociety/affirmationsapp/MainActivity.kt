package com.fsociety.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fsociety.affirmationsapp.adapter.ItemAdapter
import com.fsociety.affirmationsapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize my affirmation dataset
        val MyAffirmation = DataSource().loadAffirmation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,MyAffirmation)
        recyclerView.setHasFixedSize(true)

        

    }
}