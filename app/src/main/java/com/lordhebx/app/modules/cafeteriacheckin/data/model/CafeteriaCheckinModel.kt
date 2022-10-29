package com.lordhebx.app.modules.cafeteriacheckin.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class CafeteriaCheckinModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentCheckins: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_checkins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewall: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)

)
