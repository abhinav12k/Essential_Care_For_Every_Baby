package com.example.eceb.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eceb.R
import com.example.eceb.models.Notification

class ProfileNotifAdapter(private val notifList: Array<Notification>): RecyclerView.Adapter<ProfileNotifAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val notifText: TextView = view.findViewById(R.id.textView_profileNotificationMessage)
        val time: TextView = view.findViewById(R.id.textView_notifTime)
        val date: TextView = view.findViewById(R.id.textView_notifDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_profile_notifications,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            notifText.text = notifList[position].notification
            time.text = notifList[position].time
            date.text = notifList[position].date
        }
    }

    override fun getItemCount() = notifList.size

}