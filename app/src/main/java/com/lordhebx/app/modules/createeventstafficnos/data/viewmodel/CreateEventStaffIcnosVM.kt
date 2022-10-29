package com.lordhebx.app.modules.createeventstafficnos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.createeventstafficnos.`data`.model.CreateEventStaffIcnosModel
import org.koin.core.KoinComponent

class CreateEventStaffIcnosVM : ViewModel(), KoinComponent {
  val createEventStaffIcnosModel: MutableLiveData<CreateEventStaffIcnosModel> =
      MutableLiveData(CreateEventStaffIcnosModel())

  var navArguments: Bundle? = null
}
