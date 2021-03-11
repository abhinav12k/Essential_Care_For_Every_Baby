package com.example.eceb.ui.notifications

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eceb.R
import com.example.eceb.constants.Constants
import com.example.eceb.models.Baby
import com.google.android.material.checkbox.MaterialCheckBox

class NotificationAdapter(private val notificationList: Array<Baby>, private val typeOfNotif: String) :
    RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var registeredTime: TextView = view.findViewById(R.id.textView_registeredTime)
        var motherName: TextView = view.findViewById(R.id.textView_motherName)
        var imageViewBabyStatus: ImageView = view.findViewById(R.id.imageView_babyStatus)
        var location: TextView = view.findViewById(R.id.textView_location)
        var linearLayoutStatus: LinearLayout = view.findViewById(R.id.linearLayout_status)
        var currentStatus: TextView = view.findViewById(R.id.textView_currentStatus)
        var checkBox: MaterialCheckBox = view.findViewById(R.id.checkbox_status)
        var checkupStatus: TextView = view.findViewById(R.id.textView_checkupStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_notifications, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.apply {
            imageViewBabyStatus.setImageResource(
                when (notificationList[position].condition) {
                    Constants.NORMAL_CONDITION -> R.drawable.ic_green_elipse
                    Constants.PROBLEM_CONDITION -> R.drawable.ic_yellow_elipse
                    Constants.DANGER_CONDITION -> R.drawable.ic_red_elipse
                    else -> R.drawable.ic_green_elipse
                }
            )

            motherName.text = "Baby of ${notificationList[position].nameOfMother}"
            checkupStatus.visibility = when(typeOfNotif){
                "alerts" -> View.VISIBLE
                "risks" -> View.GONE
                else -> View.GONE
            }

            linearLayoutStatus.visibility = when(typeOfNotif){
                "alerts" -> View.GONE
                "risks" -> View.VISIBLE
                else -> View.VISIBLE
            }
        }

    }

    override fun getItemCount() = notificationList.size

}