package com.lordhebx.app.modules.eventsmoviefeedback.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityEventsMovieFeedbackBinding
import com.lordhebx.app.modules.eventsmoviefeedback.`data`.viewmodel.EventsMovieFeedbackVM
import kotlin.String
import kotlin.Unit

class EventsMovieFeedbackActivity :
    BaseActivity<ActivityEventsMovieFeedbackBinding>(R.layout.activity_events_movie_feedback) {
  private val viewModel: EventsMovieFeedbackVM by viewModels<EventsMovieFeedbackVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventsMovieFeedbackVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EVENTS_MOVIE_FEEDBACK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventsMovieFeedbackActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
