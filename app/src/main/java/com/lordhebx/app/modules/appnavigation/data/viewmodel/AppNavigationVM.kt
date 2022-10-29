package com.lordhebx.app.modules.appnavigation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.appnavigation.`data`.model.AppNavigationModel
import org.koin.core.KoinComponent

class AppNavigationVM : ViewModel(), KoinComponent {
  val appNavigationModel: MutableLiveData<AppNavigationModel> =
      MutableLiveData(AppNavigationModel())

  var navArguments: Bundle? = null
}
