package com.lordhebx.app.modules.eventsfootball.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityEventsFootballBinding
import com.lordhebx.app.modules.eventsfootball.`data`.model.ListellipseOneRowModel
import com.lordhebx.app.modules.eventsfootball.`data`.viewmodel.EventsFootballVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventsFootballActivity :
    BaseActivity<ActivityEventsFootballBinding>(R.layout.activity_events_football) {
  private val viewModel: EventsFootballVM by viewModels<EventsFootballVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseOneAdapter =
    ListellipseOneAdapter(viewModel.listellipseOneList.value?:mutableListOf())
    binding.recyclerListellipseOne.adapter = listellipseOneAdapter
    listellipseOneAdapter.setOnItemClickListener(
    object : ListellipseOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseOneRowModel) {
        onClickRecyclerListellipseOne(view, position, item)
      }
    }
    )
    viewModel.listellipseOneList.observe(this) {
      listellipseOneAdapter.updateData(it)
    }
    binding.eventsFootballVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipseOne(
    view: View,
    position: Int,
    item: ListellipseOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENTS_FOOTBALL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventsFootballActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
