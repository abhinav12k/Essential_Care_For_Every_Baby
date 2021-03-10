package com.example.eceb.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eceb.R
import com.example.eceb.models.Doctor
import de.hdodenhof.circleimageview.CircleImageView

class DoctorsAdapter(private val doctorsList: Array<Doctor>) : RecyclerView.Adapter<DoctorsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var avatarImage: CircleImageView = view.findViewById(R.id.imageView_doctorAvatar)
        val docName: TextView = view.findViewById(R.id.textView_docName)
        val isOnline: TextView = view.findViewById(R.id.textView_isDoctorOnline)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_on_call_doctors, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.apply {
            avatarImage.setImageResource(doctorsList[position].imageLink)
            docName.text = doctorsList[position].docName
            isOnline.text = when(doctorsList[position].isOnline){
                true -> "Online"
                false -> "Offline"
            }
        }

    }

    override fun getItemCount() = doctorsList.size

}