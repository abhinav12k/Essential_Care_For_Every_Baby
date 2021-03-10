package com.example.eceb.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eceb.databinding.AuthFragmentBinding

class AuthFragment : Fragment() {

    private var _binding: AuthFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AuthFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        binding.cardViewIndividual.setOnClickListener {
            val destFrag = "individual"
            val action = AuthFragmentDirections.actionAuthFragmentToSigninFragment(destFrag)
            navController.navigate(action)
        }

        binding.cardViewFacility.setOnClickListener {
            val destFrag = "facility"
            val action = AuthFragmentDirections.actionAuthFragmentToSigninFragment(destFrag)
            navController.navigate(action)
        }

    }

}