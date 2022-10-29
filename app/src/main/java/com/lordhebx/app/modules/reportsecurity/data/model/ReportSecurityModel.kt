package com.lordhebx.app.modules.reportsecurity.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ReportSecurityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownoadMonthly: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_downoad_monthly)

)
