package com.lordhebx.app.modules.createeventstaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class CreateEventStaffModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup271: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescreption: String? = MyApp.getInstance().resources.getString(R.string.lbl_descreption)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaxCapacity: String? = MyApp.getInstance().resources.getString(R.string.lbl_max_capacity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowregistrat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_allow_registrat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup270: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_icon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinimum2polls: String? =
      MyApp.getInstance().resources.getString(R.string.msg_minimum_2_polls)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddVotingpoll: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_voting_poll)

)
