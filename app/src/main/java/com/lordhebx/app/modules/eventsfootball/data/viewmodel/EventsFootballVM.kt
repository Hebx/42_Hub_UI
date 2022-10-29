package com.lordhebx.app.modules.eventsfootball.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.eventsfootball.`data`.model.EventsFootballModel
import com.lordhebx.app.modules.eventsfootball.`data`.model.ListellipseOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventsFootballVM : ViewModel(), KoinComponent {
  val eventsFootballModel: MutableLiveData<EventsFootballModel> =
      MutableLiveData(EventsFootballModel())

  var navArguments: Bundle? = null

  val listellipseOneList: MutableLiveData<MutableList<ListellipseOneRowModel>> =
      MutableLiveData(mutableListOf())
}
