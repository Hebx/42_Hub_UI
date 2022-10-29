package com.lordhebx.app.modules.homestaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ListhackathonRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHackathon: String? = MyApp.getInstance().resources.getString(R.string.lbl_hackathon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHackathonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_hackathon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHackathonTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hackathon)

)
