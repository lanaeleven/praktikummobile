package com.example.prakmobilemodul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prakmobilemodul4.databinding.FragmentList1Binding
import com.example.prakmobilemodul4.databinding.FragmentList2Binding


class List2Fragment : Fragment() {
    private var _binding: FragmentList2Binding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentList2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.rvList1
        val datasetList2 = Datasource().loadList2()
        val list2Adapter = List2Adapter(datasetList2)
        recyclerView.adapter = list2Adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}