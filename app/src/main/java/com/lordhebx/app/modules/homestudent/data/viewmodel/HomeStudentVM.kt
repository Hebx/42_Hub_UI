package com.lordhebx.app.modules.homestudent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.homestudent.`data`.model.HomeStudentModel
import com.lordhebx.app.modules.homestudent.`data`.model.Listfootballmatch2RowModel
import com.lordhebx.app.modules.homestudent.`data`.model.Listhackathon2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeStudentVM : ViewModel(), KoinComponent {
  val homeStudentModel: MutableLiveData<HomeStudentModel> = MutableLiveData(HomeStudentModel())

  var navArguments: Bundle? = null

  val listfootballmatchList: MutableLiveData<MutableList<Listfootballmatch2RowModel>> =
      MutableLiveData(mutableListOf())

  val listhackathonList: MutableLiveData<MutableList<Listhackathon2RowModel>> =
      MutableLiveData(mutableListOf())
}
