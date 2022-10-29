package com.lordhebx.app.modules.checkinmenusecurity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.checkinmenusecurity.`data`.model.CheckinMenuSecurityModel
import org.koin.core.KoinComponent

class CheckinMenuSecurityVM : ViewModel(), KoinComponent {
  val checkinMenuSecurityModel: MutableLiveData<CheckinMenuSecurityModel> =
      MutableLiveData(CheckinMenuSecurityModel())

  var navArguments: Bundle? = null
}
