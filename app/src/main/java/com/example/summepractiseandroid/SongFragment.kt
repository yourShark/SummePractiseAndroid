package com.example.summepractiseandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.summepractiseandroid.databinding.FragmentSongBinding
import com.google.android.material.snackbar.Snackbar

class SongFragment : Fragment(R.layout.fragment_song) {

    private var _binding: FragmentSongBinding? = null
    private val binding get() = _binding!!
    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentSongBinding.bind(view)


        adapter = SongAdapter(SongRepository.songs){
            Snackbar.make(binding.root, "Music id: ${it.id}", Snackbar.LENGTH_SHORT).show()
        }
        binding.rvSong.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}