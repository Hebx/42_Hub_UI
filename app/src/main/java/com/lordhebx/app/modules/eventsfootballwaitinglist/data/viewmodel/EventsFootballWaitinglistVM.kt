package com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.model.EventsFootballWaitinglistModel
import com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.model.ListellipseOne1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventsFootballWaitinglistVM : ViewModel(), KoinComponent {
  val eventsFootballWaitinglistModel: MutableLiveData<EventsFootballWaitinglistModel> =
      MutableLiveData(EventsFootballWaitinglistModel())

  var navArguments: Bundle? = null

  val listellipseOneList: MutableLiveData<MutableList<ListellipseOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
