package com.lordhebx.app.modules.reportsecurity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.reportsecurity.`data`.model.Listellipse1RowModel
import com.lordhebx.app.modules.reportsecurity.`data`.model.ReportSecurityModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReportSecurityVM : ViewModel(), KoinComponent {
  val reportSecurityModel: MutableLiveData<ReportSecurityModel> =
      MutableLiveData(ReportSecurityModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<Listellipse1RowModel>> =
      MutableLiveData(mutableListOf())
}
