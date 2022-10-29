package com.lordhebx.app.modules.eventsmoviefeedbackadd.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityEventsMovieFeedbackAddBinding
import com.lordhebx.app.modules.eventsmoviefeedbackadd.`data`.viewmodel.EventsMovieFeedbackAddVM
import kotlin.String
import kotlin.Unit

class EventsMovieFeedbackAddActivity :
    BaseActivity<ActivityEventsMovieFeedbackAddBinding>(R.layout.activity_events_movie_feedback_add)
    {
  private val viewModel: EventsMovieFeedbackAddVM by viewModels<EventsMovieFeedbackAddVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventsMovieFeedbackAddVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EVENTS_MOVIE_FEEDBACK_ADD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventsMovieFeedbackAddActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
