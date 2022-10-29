package com.lordhebx.app.modules.cafeteriamenu.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class CafeteriaMenuModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScan: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAelita: String? = MyApp.getInstance().resources.getString(R.string.lbl_aelita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAelitaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_alice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAelitaTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_yumi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAelitaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_eric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckins: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_ins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_food)

)
