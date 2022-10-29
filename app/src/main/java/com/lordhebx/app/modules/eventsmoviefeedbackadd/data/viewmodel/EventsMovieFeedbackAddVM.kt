package com.lordhebx.app.modules.eventsmoviefeedbackadd.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.eventsmoviefeedbackadd.`data`.model.EventsMovieFeedbackAddModel
import org.koin.core.KoinComponent

class EventsMovieFeedbackAddVM : ViewModel(), KoinComponent {
  val eventsMovieFeedbackAddModel: MutableLiveData<EventsMovieFeedbackAddModel> =
      MutableLiveData(EventsMovieFeedbackAddModel())

  var navArguments: Bundle? = null
}
