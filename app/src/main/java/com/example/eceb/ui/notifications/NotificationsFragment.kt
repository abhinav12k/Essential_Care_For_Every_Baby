package com.example.eceb.ui.notifications

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eceb.R
import com.example.eceb.constants.Constants
import com.example.eceb.databinding.FragmentNotificationsBinding
import com.example.eceb.models.Baby
import com.google.android.material.tabs.TabLayout

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    private val demoList: Array<Baby> = arrayOf(
        Baby(22,"Riya","Female","Prenatal Ward",R.drawable.ic_female, Constants.DANGER_CONDITION),
        Baby(22,"Nia","Male","Prenatal Ward",R.drawable.ic_male, Constants.PROBLEM_CONDITION),
        Baby(22,"Adisa","Female","Prenatal Ward",R.drawable.ic_female, Constants.NORMAL_CONDITION),
        Baby(22,"Deka","Female","Prenatal Ward",R.drawable.ic_female, Constants.PROBLEM_CONDITION),
        Baby(22,"Fiona","Male","Prenatal Ward",R.drawable.ic_male, Constants.NORMAL_CONDITION),
        Baby(22,"Riya","Female","Prenatal Ward",R.drawable.ic_female, Constants.DANGER_CONDITION),
        Baby(22,"Nia","Male","Prenatal Ward",R.drawable.ic_male, Constants.PROBLEM_CONDITION),
        Baby(22,"Adisa","Female","Prenatal Ward",R.drawable.ic_female, Constants.NORMAL_CONDITION),
        Baby(22,"Deka","Female","Prenatal Ward",R.drawable.ic_female, Constants.PROBLEM_CONDITION),
        Baby(22,"Fiona","Male","Prenatal Ward",R.drawable.ic_male, Constants.NORMAL_CONDITION),
        Baby(22,"Riya","Female","Prenatal Ward",R.drawable.ic_female, Constants.DANGER_CONDITION),
        Baby(22,"Nia","Male","Prenatal Ward",R.drawable.ic_male, Constants.PROBLEM_CONDITION),
        Baby(22,"Adisa","Female","Prenatal Ward",R.drawable.ic_female, Constants.NORMAL_CONDITION),
        Baby(22,"Deka","Female","Prenatal Ward",R.drawable.ic_female, Constants.PROBLEM_CONDITION),
        Baby(22,"Fiona","Male","Prenatal Ward",R.drawable.ic_male, Constants.NORMAL_CONDITION),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var typeOfNotif = "risks"

        binding.tabLayoutNotificatons.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        typeOfNotif = "risks"
                    }
                    1 -> {
                        typeOfNotif = "alerts"
                    }
                }
                binding.recyclerViewNotifications.adapter = NotificationAdapter(demoList, typeOfNotif)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        binding.recyclerViewNotifications.apply {
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

            adapter = NotificationAdapter(demoList, typeOfNotif)

            addItemDecoration(
                DividerItemDecoration(
                    context,
                    DividerItemDecoration.VERTICAL
                )
            )
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}