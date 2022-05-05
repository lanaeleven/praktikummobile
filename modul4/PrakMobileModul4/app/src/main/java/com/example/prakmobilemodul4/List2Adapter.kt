package com.example.prakmobilemodul4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import androidx.core.os.bundleOf
import androidx.navigation.Navigation

import androidx.recyclerview.widget.RecyclerView

class List2Adapter(
    private val dataset: List<DigitalDrawingTool>
): RecyclerView.Adapter<List2Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List2Adapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from( parent.context ).inflate( R.layout.list1_layout, parent, false )
        )
    }

    override fun onBindViewHolder(holder: List2Adapter.ViewHolder, position: Int) {
        holder.button.setText(dataset[position].judul)
        val judul = dataset[position].judul
        val gambar = dataset[position].gambar
        val harga = dataset[position].harga
        val detail = dataset[position].detail

        val bundle = bundleOf("judul" to judul, "harga" to harga, "gambar" to gambar, "detail" to detail)
        holder.button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.detailList1,
            bundle
        ))

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val button = view.findViewById<Button>(R.id.namaPentab)
    }

}