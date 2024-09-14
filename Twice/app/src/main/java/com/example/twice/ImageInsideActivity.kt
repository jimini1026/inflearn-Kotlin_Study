package com.example.twice

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        if (getData == "1") {
            memberImage.setImageResource(R.drawable.member_1)
        } else if (getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        } else if (getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        } else if (getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        } else if (getData == "5") {
            memberImage.setImageResource(R.drawable.member_5)
        } else if (getData == "6") {
            memberImage.setImageResource(R.drawable.member_6)
        } else if (getData == "7") {
            memberImage.setImageResource(R.drawable.member_7)
        } else if (getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        } else if (getData == "9") {
            memberImage.setImageResource(R.drawable.member_9)
        } else
    }
}