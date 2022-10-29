package com.lordhebx.app.modules.menustaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ListmovienightRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMovieNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMovieNightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMovieNightTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie_night)

)
