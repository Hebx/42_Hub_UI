package com.lordhebx.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.dashboard.`data`.model.DashboardModel
import org.koin.core.KoinComponent

class DashboardVM : ViewModel(), KoinComponent {
  val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  var navArguments: Bundle? = null
}
