package com.example.eceb.ui.listOfBabies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eceb.R
import com.example.eceb.constants.Constants
import com.example.eceb.databinding.FragmentBabiesBinding
import com.example.eceb.models.Baby
import com.example.eceb.models.Doctor

class BabiesFragment : Fragment() {

    private var _binding: FragmentBabiesBinding? = null
    private val binding get() = _binding!!

    private val demoList: Array<Baby> = arrayOf(
        Baby(22,"Riya","Female","Prenatal Ward",R.drawable.ic_female,Constants.DANGER_CONDITION),
        Baby(22,"Nia","Male","Prenatal Ward",R.drawable.ic_male,Constants.PROBLEM_CONDITION),
        Baby(22,"Adisa","Female","Prenatal Ward",R.drawable.ic_female,Constants.NORMAL_CONDITION),
        Baby(22,"Deka","Female","Prenatal Ward",R.drawable.ic_female,Constants.PROBLEM_CONDITION),
        Baby(22,"Fiona","Male","Prenatal Ward",R.drawable.ic_male,Constants.NORMAL_CONDITION),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBabiesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewPastRegistration.apply {

            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

            adapter = RegisteredBabiesAdapter(demoList)

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}