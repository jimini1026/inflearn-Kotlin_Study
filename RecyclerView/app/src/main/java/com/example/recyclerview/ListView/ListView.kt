package com.example.recyclerview.ListView

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.R

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

//        val listItem = mutableListOf<String>()
//
//        listItem.add("A")
//        listItem.add("B")
//        listItem.add("C")

        val listItem2 = mutableListOf<ListViewModel>()
        listItem2.add(ListViewModel("a", "b"))
        listItem2.add(ListViewModel("c", "d"))
        listItem2.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListView)
        val listviewAdapter = ListViewAdapter(listItem2)
        listview.adapter = listviewAdapter
        
        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, listItem2[i].text1, Toast.LENGTH_LONG).show()
        }
    }
}