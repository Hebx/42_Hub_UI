package com.lordhebx.app.modules.eventsmovie.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.eventsmovie.`data`.model.EventsMovieModel
import org.koin.core.KoinComponent

class EventsMovieVM : ViewModel(), KoinComponent {
  val eventsMovieModel: MutableLiveData<EventsMovieModel> = MutableLiveData(EventsMovieModel())

  var navArguments: Bundle? = null
}
