package com.lordhebx.app.modules.foods.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class FoodsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMacCheese: String? = MyApp.getInstance().resources.getString(R.string.lbl_mac_cheese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerydelecious: String? =
      MyApp.getInstance().resources.getString(R.string.msg_very_delecious)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveHundredTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_10)

)
