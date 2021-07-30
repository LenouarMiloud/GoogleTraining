package com.fsociety.affirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewSize : TextView = findViewById(R.id.sizeTextView)
        textViewSize.text = Datasource().loadAffirmations().size.toString()

    }
}