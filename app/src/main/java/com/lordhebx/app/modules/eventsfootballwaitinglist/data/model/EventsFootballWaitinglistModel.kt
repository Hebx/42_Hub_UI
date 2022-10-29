package com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class EventsFootballWaitinglistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFootballMatch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_football_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3414: String? = MyApp.getInstance().resources.getString(R.string.lbl_34_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_active_maria_pi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWaitingList: String? = MyApp.getInstance().resources.getString(R.string.lbl_waiting_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAelita: String? = MyApp.getInstance().resources.getString(R.string.lbl_aelita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)

)
