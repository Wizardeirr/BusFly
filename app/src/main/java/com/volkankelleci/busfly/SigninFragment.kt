package com.volkankelleci.busfly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.volkankelleci.busfly.databinding.FragmentSigninBinding
import com.volkankelleci.busfly.room.User


class SigninFragment : Fragment() {
    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel = ViewModelProvider(this).get(BaseViewModel::class.java)

        binding.btnSignUp.setOnClickListener {
            val name=binding.etFirstName.text.toString()
            val surname=binding.etLastName.text.toString()
            val id=binding.etTC.text.toString().toInt()
            val email=binding.etEmail.text.toString()
            val date=binding.etBirthDate.text.toString().toInt()
            val password=binding.etPassword.text.toString()
            val male = if (binding.radioButtonMale.isChecked) "Erkek" else "Kadın"

            val user=User(0,name,surname,id,date, male,email, password)
            if (name.isNotEmpty()&& surname.isNotEmpty()&&email.isNotEmpty()&&male.isNotEmpty()&&password.isNotEmpty()&&id.equals(Int)&&date.equals(Int)){
                binding.btnSignUp.setOnClickListener {
                    viewModel.insertUser(user)

                }

            }


        }
        return view
    }

}