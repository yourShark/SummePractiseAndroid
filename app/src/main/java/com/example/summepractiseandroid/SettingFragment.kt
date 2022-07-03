package com.example.summepractiseandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.summepractiseandroid.databinding.FragmentSettingBinding

class SettingFragment : Fragment(R.layout.fragment_setting) {

    private var _binding: FragmentSettingBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingBinding.bind(view)

        with(binding) {
            btnUnactive.setOnClickListener {
                findNavController().navigate(
                    R.id.action_settingFragment_to_unactiveFragment2,
                    UnactiveFragment.createBundle((tvSetting.text?:"Error").toString()))
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}