package com.lordhebx.app.modules.cafeteriamenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.cafeteriamenu.`data`.model.CafeteriaMenuModel
import org.koin.core.KoinComponent

class CafeteriaMenuVM : ViewModel(), KoinComponent {
  val cafeteriaMenuModel: MutableLiveData<CafeteriaMenuModel> =
      MutableLiveData(CafeteriaMenuModel())

  var navArguments: Bundle? = null
}
