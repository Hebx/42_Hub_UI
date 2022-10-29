package com.lordhebx.app.modules.homestaff.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.homestaff.`data`.model.HomeStaffModel
import com.lordhebx.app.modules.homestaff.`data`.model.ListfootballmatchRowModel
import com.lordhebx.app.modules.homestaff.`data`.model.ListhackathonRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeStaffVM : ViewModel(), KoinComponent {
  val homeStaffModel: MutableLiveData<HomeStaffModel> = MutableLiveData(HomeStaffModel())

  var navArguments: Bundle? = null

  val listfootballmatchList: MutableLiveData<MutableList<ListfootballmatchRowModel>> =
      MutableLiveData(mutableListOf())

  val listhackathonList: MutableLiveData<MutableList<ListhackathonRowModel>> =
      MutableLiveData(mutableListOf())
}
