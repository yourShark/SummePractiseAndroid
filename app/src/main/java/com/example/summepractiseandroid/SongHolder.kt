package com.example.summepractiseandroid

import androidx.recyclerview.widget.RecyclerView
import com.example.summepractiseandroid.databinding.ItemSongBinding

class SongHolder(

    private val binding: ItemSongBinding,
    private val onItemClick: (Song) -> Unit
): RecyclerView.ViewHolder(binding.root) {


    fun onBind(song: Song){
        with(binding){
            tvName.text = song.name
            tvAutor.text = song.author
            root.setOnClickListener{
                onItemClick(song)
            }
        }
    }
}