package com.lordhebx.app.modules.foods.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class FoodsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddFoodbox: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_food_box)

)
