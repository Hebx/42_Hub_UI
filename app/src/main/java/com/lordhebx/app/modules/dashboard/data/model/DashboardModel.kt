package com.lordhebx.app.modules.dashboard.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
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

)
