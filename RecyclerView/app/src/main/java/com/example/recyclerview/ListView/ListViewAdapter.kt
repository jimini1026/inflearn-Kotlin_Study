package com.example.recyclerview.ListView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.recyclerview.R

class ListViewAdapter(val List: MutableList<ListViewModel>): BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1

        if (convertView == null) {
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        var title = convertView!!.findViewById<TextView>(R.id.listviewItemText)
        title.text = List[p0].text1

        var title2 = convertView.findViewById<TextView>(R.id.listviewItemText2)
        title2.text = List[p0].text2

        return convertView!!
    }

}