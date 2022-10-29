package com.lordhebx.app.modules.checkinsecurity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.checkinsecurity.`data`.model.CheckinSecurityModel
import com.lordhebx.app.modules.checkinsecurity.`data`.model.ListellipseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CheckinSecurityVM : ViewModel(), KoinComponent {
  val checkinSecurityModel: MutableLiveData<CheckinSecurityModel> =
      MutableLiveData(CheckinSecurityModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<ListellipseRowModel>> =
      MutableLiveData(mutableListOf())
}
