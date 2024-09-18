package com.example.myapplication.list

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var testList = mutableListOf<String>()
        testList.add("a")
        testList.add("b")
        testList.add("c")

        Log.d("ListActivity", testList.toString()) //[a, b, c]

        Log.d("ListActivity", testList[0]) //a
        Log.d("ListActivity", testList[1]) //b
        Log.d("ListActivity", testList[2]) //c
    }
}