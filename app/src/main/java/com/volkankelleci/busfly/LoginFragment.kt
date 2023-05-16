package com.volkankelleci.busfly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.volkankelleci.busfly.databinding.FragmentLoginBinding
import com.volkankelleci.busfly.room.User
import com.volkankelleci.busfly.util.BaseVBFragment

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BaseViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel = ViewModelProvider(this).get(BaseViewModel::class.java)

        viewModel.users.observe(viewLifecycleOwner, Observer {

        })
        return view
    }
    fun observeData(){
        viewModel.users.observe(viewLifecycleOwner,Observer{

        })
    }


}