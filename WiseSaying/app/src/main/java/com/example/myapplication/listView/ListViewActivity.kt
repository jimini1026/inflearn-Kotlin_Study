package com.example.myapplication.listView

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a", "b"))
        list_item.add(ListViewModel("c", "d"))
        list_item.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListView)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter
    }
}