package com.volkankelleci.busfly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.volkankelleci.busfly.databinding.FragmentSearchBinding
import com.volkankelleci.busfly.databinding.FragmentTravelDetailBinding

class TravelDetailFragment : Fragment() {
    private var _binding: FragmentTravelDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTravelDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}