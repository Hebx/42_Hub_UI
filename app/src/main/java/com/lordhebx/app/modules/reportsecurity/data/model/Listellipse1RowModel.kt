package com.lordhebx.app.modules.reportsecurity.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class Listellipse1RowModel(
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
  var txtAelitaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_aelita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_jan_10_2022_10)

)
