package com.lordhebx.app.modules.eventsmovie.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityEventsMovieBinding
import com.lordhebx.app.modules.eventsmovie.`data`.viewmodel.EventsMovieVM
import kotlin.String
import kotlin.Unit

class EventsMovieActivity : BaseActivity<ActivityEventsMovieBinding>(R.layout.activity_events_movie)
    {
  private val viewModel: EventsMovieVM by viewModels<EventsMovieVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventsMovieVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EVENTS_MOVIE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventsMovieActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
