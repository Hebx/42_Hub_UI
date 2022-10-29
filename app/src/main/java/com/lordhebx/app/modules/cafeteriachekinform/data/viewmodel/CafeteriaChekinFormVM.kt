package com.lordhebx.app.modules.cafeteriachekinform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.cafeteriachekinform.`data`.model.CafeteriaChekinFormModel
import com.lordhebx.app.modules.cafeteriachekinform.`data`.model.Listellipse3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CafeteriaChekinFormVM : ViewModel(), KoinComponent {
  val cafeteriaChekinFormModel: MutableLiveData<CafeteriaChekinFormModel> =
      MutableLiveData(CafeteriaChekinFormModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<Listellipse3RowModel>> =
      MutableLiveData(mutableListOf())
}
