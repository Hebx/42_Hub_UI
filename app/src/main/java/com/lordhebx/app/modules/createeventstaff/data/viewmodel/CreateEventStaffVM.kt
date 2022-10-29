package com.lordhebx.app.modules.createeventstaff.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.createeventstaff.`data`.model.CreateEventStaffModel
import org.koin.core.KoinComponent

class CreateEventStaffVM : ViewModel(), KoinComponent {
  val createEventStaffModel: MutableLiveData<CreateEventStaffModel> =
      MutableLiveData(CreateEventStaffModel())

  var navArguments: Bundle? = null
}
