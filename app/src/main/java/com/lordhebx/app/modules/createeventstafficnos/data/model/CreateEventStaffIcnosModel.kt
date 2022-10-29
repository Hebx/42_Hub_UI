package com.lordhebx.app.modules.createeventstafficnos.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class CreateEventStaffIcnosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddVotingpoll: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_voting_poll)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup141: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_name)
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
  var txtMinimum2polls: String? =
      MyApp.getInstance().resources.getString(R.string.msg_minimum_2_polls)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowFeedback: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_allow_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMovienight: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie_night2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFootball: String? = MyApp.getInstance().resources.getString(R.string.lbl_football)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMusuem: String? = MyApp.getInstance().resources.getString(R.string.lbl_musuem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneral: String? = MyApp.getInstance().resources.getString(R.string.lbl_general)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFooseballTour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fooseball_tour)

)
