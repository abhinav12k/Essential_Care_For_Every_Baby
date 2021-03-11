package com.example.eceb.ui.listOfBabies

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.eceb.R
import com.example.eceb.models.Baby

class RegisteredBabiesAdapter(private val babiesList: Array<Baby>) :
    RecyclerView.Adapter<RegisteredBabiesAdapter.ViewHolder>() {
    private lateinit var context : Context
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var registeredTime: TextView = view.findViewById(R.id.textView_registeredTime)
        var motherName: TextView = view.findViewById(R.id.textView_motherName)
        var gender: TextView = view.findViewById(R.id.textView_gender)
        var imageViewGender: ImageView = view.findViewById(R.id.imageView_gender)
        var location: TextView = view.findViewById(R.id.textView_location)
        var listItemBackground: FrameLayout =
            view.findViewById(R.id.list_item_registeredBabiesBackground)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_registered_babies, parent, false)
        context = view.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            registeredTime.text =
                babiesList[position].timeOfBirth.toString() + " Minutes from Birth"
            registeredTime.background = (
                when (babiesList[position].condition) {
                    "danger" -> getDrawable(context,R.drawable.ic_danger_background)
                    "normal" -> getDrawable(context,R.drawable.ic_normal_background)
                    "problem" -> getDrawable(context,R.drawable.ic_problem_background)
                    else -> getDrawable(context,R.drawable.ic_normal_background)
                }
            )
            motherName.text = babiesList[position].nameOfMother
            gender.text = babiesList[position].gender
            imageViewGender.setImageResource(babiesList[position].genderImage)
            location.text = babiesList[position].location
            listItemBackground.setBackgroundResource(
                when (babiesList[position].condition) {
                    "danger" -> R.color.item_red_color
                    "normal" -> R.color.item_green_color
                    "problem" -> R.color.item_yellow_color
                    else -> R.color.item_green_color
                }
            )
        }
    }

    override fun getItemCount() = babiesList.size

}