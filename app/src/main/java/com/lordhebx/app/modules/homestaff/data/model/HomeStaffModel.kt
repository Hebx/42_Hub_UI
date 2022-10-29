package com.lordhebx.app.modules.homestaff.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class HomeStaffModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckinOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckinTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckinThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddEvent: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddEventOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddEventTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddEventThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_event)
  ,
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
