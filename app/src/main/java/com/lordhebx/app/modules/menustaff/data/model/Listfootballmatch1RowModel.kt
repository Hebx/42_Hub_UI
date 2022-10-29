package com.lordhebx.app.modules.menustaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class Listfootballmatch1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFootballMatch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_football_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFootballMatchOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_football_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFootballMatchTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_football_match)

)
