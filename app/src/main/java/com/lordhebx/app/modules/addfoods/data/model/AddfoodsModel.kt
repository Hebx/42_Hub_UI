package com.lordhebx.app.modules.addfoods.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class AddfoodsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_food_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescreptioni: String? = MyApp.getInstance().resources.getString(R.string.msg_descreption_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuantity: String? = MyApp.getInstance().resources.getString(R.string.lbl_quantity)

)
