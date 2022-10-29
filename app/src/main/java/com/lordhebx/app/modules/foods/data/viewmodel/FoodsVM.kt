package com.lordhebx.app.modules.foods.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.foods.`data`.model.FoodsModel
import com.lordhebx.app.modules.foods.`data`.model.FoodsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FoodsVM : ViewModel(), KoinComponent {
  val foodsModel: MutableLiveData<FoodsModel> = MutableLiveData(FoodsModel())

  var navArguments: Bundle? = null

  val foodsList: MutableLiveData<MutableList<FoodsRowModel>> = MutableLiveData(mutableListOf())
}
