package com.example.eceb.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eceb.R
import com.example.eceb.constants.Constants
import com.example.eceb.databinding.FragmentProfileBinding
import com.example.eceb.models.Baby
import com.example.eceb.models.Notification

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? =null
    private val binding get() = _binding!!

    private val demoList: Array<Notification> = arrayOf(
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewProfileNotifications.apply {

            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

            adapter = ProfileNotifAdapter(demoList)
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