package com.example.eceb.dummyData

import com.example.eceb.R
import com.example.eceb.constants.Constants
import com.example.eceb.models.Baby
import com.example.eceb.models.Doctor
import com.example.eceb.models.Notification

object DummyData {

    val dummyDocList: Array<Doctor> = arrayOf(
    Doctor(R.drawable.ic_doctor_andrea, "Andrea", true),
    Doctor(R.drawable.ic_doctor_kim, "Kim", true),
    Doctor(R.drawable.ic_doctor_jane, "Jane", true),
    Doctor(R.drawable.ic_doctor_andrea, "Lara", true),
    Doctor(R.drawable.ic_doctor_kim, "Jennie", true),
    )

    val dummyBabiesList: Array<Baby> = arrayOf(
        Baby(22,"Riya","Female","Prenatal Ward",R.drawable.ic_female, Constants.DANGER_CONDITION),
        Baby(22,"Nia","Male","Prenatal Ward",R.drawable.ic_male, Constants.PROBLEM_CONDITION),
        Baby(22,"Adisa","Female","Prenatal Ward",R.drawable.ic_female, Constants.NORMAL_CONDITION),
        Baby(22,"Deka","Female","Prenatal Ward",R.drawable.ic_female, Constants.PROBLEM_CONDITION),
        Baby(22,"Fiona","Male","Prenatal Ward",R.drawable.ic_male, Constants.NORMAL_CONDITION),
    )

    val dummyNotifList: Array<Baby> = arrayOf(
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

    val dummyProfileNotifList: Array<Notification> = arrayOf(
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
        Notification("Baby 1 of Oni registered at the Post natal ward at 11:53 AM","11:53 AM","19/05/2019"),
    )

}