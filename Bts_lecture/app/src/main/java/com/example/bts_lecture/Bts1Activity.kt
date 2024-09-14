package com.example.bts_lecture

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bts1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bts1)

        val imageView = findViewById<ImageView>(R.id.image)
        val image = intent.getIntExtra("image", 0)

        imageView.setImageResource(image)

    }
}