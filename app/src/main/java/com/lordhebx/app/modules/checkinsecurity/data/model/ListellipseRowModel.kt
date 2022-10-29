package com.lordhebx.app.modules.checkinsecurity.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAelita: String? = MyApp.getInstance().resources.getString(R.string.lbl_aelita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)

)
