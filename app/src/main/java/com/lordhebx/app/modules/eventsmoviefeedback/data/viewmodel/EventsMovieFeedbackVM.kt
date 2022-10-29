package com.lordhebx.app.modules.eventsmoviefeedback.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.eventsmoviefeedback.`data`.model.EventsMovieFeedbackModel
import org.koin.core.KoinComponent

class EventsMovieFeedbackVM : ViewModel(), KoinComponent {
  val eventsMovieFeedbackModel: MutableLiveData<EventsMovieFeedbackModel> =
      MutableLiveData(EventsMovieFeedbackModel())

  var navArguments: Bundle? = null
}
