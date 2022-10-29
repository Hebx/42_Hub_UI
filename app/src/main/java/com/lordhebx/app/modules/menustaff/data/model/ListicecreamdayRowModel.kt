package com.lordhebx.app.modules.menustaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ListicecreamdayRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIceCreamDay: String? = MyApp.getInstance().resources.getString(R.string.lbl_ice_cream_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIceCreamDayOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ice_cream_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIceCreamDayTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ice_cream_day)

)
