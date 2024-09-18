package com.example.myapplication.backPress

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.util.logging.Handler

class BackPressActivity : AppCompatActivity() {
    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_press)

    }

    override fun onBackPressed() {
        if (isDouble == true) {
            super.onBackPressed()
        }

        isDouble = true
        Toast.makeText(this, "종료하실려면 더블 클릭", Toast.LENGTH_LONG).show()

        android.os.Handler().postDelayed(Runnable {
            isDouble = false
        }, 2000)
    }
}