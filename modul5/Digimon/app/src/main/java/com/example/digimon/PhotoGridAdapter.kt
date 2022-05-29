package com.example.digimon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.digimon.databinding.GridViewItemBinding
import com.example.digimon.network.DigimonData


class PhotoGridAdapter : ListAdapter<DigimonData,
        PhotoGridAdapter.DigimonDataViewHolder>(DiffCallback) {



    class DigimonDataViewHolder(private var binding: GridViewItemBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(DigimonData: DigimonData) {
            binding.photo = DigimonData
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<DigimonData>() {
        override fun areItemsTheSame(oldItem: DigimonData, newItem: DigimonData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: DigimonData, newItem: DigimonData): Boolean {
            return oldItem.img == newItem.img
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotoGridAdapter.DigimonDataViewHolder {
        return DigimonDataViewHolder(GridViewItemBinding.inflate(
            LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhotoGridAdapter.DigimonDataViewHolder, position: Int) {
        val digimonPhoto = getItem(position)
        holder.bind(digimonPhoto)
    }


}