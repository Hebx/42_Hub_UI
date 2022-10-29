package com.lordhebx.app.modules.onboard.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt42ACCESSHUB: String? = MyApp.getInstance().resources.getString(R.string.lbl_42_access_hub)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullydigital: String? = MyApp.getInstance().resources.getString(R.string.msg_fully_digital)

)
