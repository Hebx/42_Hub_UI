package com.lordhebx.app.modules.menustaff.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.menustaff.`data`.model.Listfootballmatch1RowModel
import com.lordhebx.app.modules.menustaff.`data`.model.Listhackathon1RowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListicecreamdayRowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListmovienightRowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListtownhallmeetinRowModel
import com.lordhebx.app.modules.menustaff.`data`.model.MenuStaffModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuStaffVM : ViewModel(), KoinComponent {
  val menuStaffModel: MutableLiveData<MenuStaffModel> = MutableLiveData(MenuStaffModel())

  var navArguments: Bundle? = null

  val listfootballmatchList: MutableLiveData<MutableList<Listfootballmatch1RowModel>> =
      MutableLiveData(mutableListOf())

  val listmovienightList: MutableLiveData<MutableList<ListmovienightRowModel>> =
      MutableLiveData(mutableListOf())

  val listicecreamdayList: MutableLiveData<MutableList<ListicecreamdayRowModel>> =
      MutableLiveData(mutableListOf())

  val listtownhallmeetinList: MutableLiveData<MutableList<ListtownhallmeetinRowModel>> =
      MutableLiveData(mutableListOf())

  val listhackathonList: MutableLiveData<MutableList<Listhackathon1RowModel>> =
      MutableLiveData(mutableListOf())
}
