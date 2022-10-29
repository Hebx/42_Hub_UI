package com.lordhebx.app.modules.menustaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ListtownhallmeetinRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTownhallMeetin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_townhall_meetin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTownhallMeetinOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_townhall_meetin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTownhallMeetinTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_townhall_meetin)

)
