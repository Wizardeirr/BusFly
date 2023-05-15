package com.volkankelleci.busfly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.volkankelleci.busfly.databinding.FragmentLoginBinding
import com.volkankelleci.busfly.databinding.FragmentPaymentBinding


class PaymentFragment : Fragment() {
    private var _binding: FragmentPaymentBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentPaymentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }


}