package com.koose.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koose.recyclerview.R
import com.koose.recyclerview.model.ImageFromNet

class ImageFromNetAdapter(private val context: Context, private val imgList: List<ImageFromNet>): RecyclerView.Adapter<ImageFromNetAdapter.ImageViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
       val rootView = LayoutInflater.from(context).inflate(R.layout.img_card_layout, parent, false)
        return ImageViewHolder(rootView)

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imgPosition = imgList[position]

        holder.nameImg.text = imgPosition.name
        holder.description.text = imgPosition.description

        Glide
            .with(context)
            .load(imgPosition.img)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imgURL)


    }

    override fun getItemCount(): Int {
        return imgList.size
        }

    class ImageViewHolder(imageItem:View):RecyclerView.ViewHolder(imageItem) {
        val imgURL: ImageView = imageItem.findViewById(R.id.imageview)
        val nameImg:TextView = imageItem.findViewById(R.id.textView)
        val description:TextView = imageItem.findViewById(R.id.description)

    }
}