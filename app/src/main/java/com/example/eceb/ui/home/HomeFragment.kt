package com.example.eceb.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eceb.R
import com.example.eceb.databinding.FragmentHomeBinding
import com.example.eceb.models.Doctor

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val demoList: Array<Doctor> = arrayOf(
        Doctor(R.drawable.ic_doctor_andrea, "Andrea", true),
        Doctor(R.drawable.ic_doctor_kim, "Kim", true),
        Doctor(R.drawable.ic_doctor_jane, "Jane", true),
        Doctor(R.drawable.ic_doctor_andrea, "Lara", true),
        Doctor(R.drawable.ic_doctor_kim, "Jennie", true),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.recyclerViewOnCallDoctors.apply {

            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )

            adapter = DoctorsAdapter(demoList)

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}