package com.example.tsj.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.model.FileModel

class FileViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var title: TextView = itemView.findViewById(R.id.titleF)
    var address: TextView = itemView.findViewById(R.id.addressF)

    fun bind(get: FileModel) {
        title.setText(get.title)
        address.setText(get.address)
    }

}
