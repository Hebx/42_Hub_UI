package com.lordhebx.app.modules.cafeteriacheckin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.cafeteriacheckin.`data`.model.CafeteriaCheckinModel
import com.lordhebx.app.modules.cafeteriacheckin.`data`.model.Listellipse2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CafeteriaCheckinVM : ViewModel(), KoinComponent {
  val cafeteriaCheckinModel: MutableLiveData<CafeteriaCheckinModel> =
      MutableLiveData(CafeteriaCheckinModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<Listellipse2RowModel>> =
      MutableLiveData(mutableListOf())
}
