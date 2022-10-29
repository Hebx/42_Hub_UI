package com.lordhebx.app.modules.homestudent.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class HomeStudentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt1010Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1010Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1010Four: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHackathonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_hackathon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHadiHammamBilOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_hammam_bil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1010Five: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_10)

)
