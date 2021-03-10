package com.example.eceb.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.eceb.R
import com.example.eceb.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    private var _binding : FragmentSigninBinding? = null
    private val binding get() = _binding!!

    private val args: SigninFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSigninBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        when(args.typeOfLogin){

            "individual" -> {
                binding.apply {
                    etEmployeeCode.hint = "Local Login Address"
                    etEmployeePassword.hint = "Password"
                }
            }

            "facility" -> {
                binding.apply {
                    etEmployeeCode.hint ="Enter Employee Code"
                    etEmployeePassword.hint = "Enter the Password"
                }
            }
        }

        binding.cardViewSigninBtn.setOnClickListener {
            val action = SigninFragmentDirections.actionSigninFragmentToMainNavigation()
            navController.navigate(action)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}