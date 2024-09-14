package com.example.bts_lecture

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val imageList: List<Int>): RecyclerView.Adapter<com.example.bts_lecture.Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(imageList[position])

        holder.imageView.setOnClickListener {
            val context = holder.itemView.context

            val intent = Intent(context, Bts1Activity::class.java)
            intent.putExtra("image", imageList[position])

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }


}