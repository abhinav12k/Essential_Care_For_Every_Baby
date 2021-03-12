package com.example.eceb.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eceb.R
import com.example.eceb.databinding.FragmentHomeBinding
import com.example.eceb.dummyData.DummyData
import com.example.eceb.models.Doctor

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val demoList = DummyData.dummyDocList

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        val action = HomeFragmentDirections.actionNavigationHomeToNavigationListOfBabies()
        binding.cardViewAdmitted.setOnClickListener {
            navController.navigate(action)
        }

        binding.cardViewDischarged.setOnClickListener {
            navController.navigate(action)
        }

        binding.cardViewHighRisk.setOnClickListener {
            navController.navigate(action)
        }

        binding.recyclerViewOnCallDoctors.apply {

            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )

            adapter = DoctorsAdapter(demoList)

        }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}