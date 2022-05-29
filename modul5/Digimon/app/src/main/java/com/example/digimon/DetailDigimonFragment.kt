package com.example.digimon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.digimon.databinding.FragmentDetailDigimonBinding

class DetailDigimonFragment : Fragment() {

    private val viewModel: DigimonViewModel by viewModels()
    private var binding: FragmentDetailDigimonBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentDetailDigimonBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            viewModel = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
    }

}