package com.lordhebx.app.modules.calendar.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class CalendarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_oct)
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
