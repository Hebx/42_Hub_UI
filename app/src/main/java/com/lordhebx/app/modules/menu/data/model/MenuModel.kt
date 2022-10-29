package com.lordhebx.app.modules.menu.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class MenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHadiKaddoura: String? = MyApp.getInstance().resources.getString(R.string.lbl_hadi_kaddoura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt971506669529: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_971_50_666_9529)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEvents: String? = MyApp.getInstance().resources.getString(R.string.lbl_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewall: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaysFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_todays_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVisaApplicatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_visa_applicatio)

)
