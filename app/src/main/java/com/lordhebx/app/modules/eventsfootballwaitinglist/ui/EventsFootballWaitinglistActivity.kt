package com.lordhebx.app.modules.eventsfootballwaitinglist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityEventsFootballWaitinglistBinding
import com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.model.ListellipseOne1RowModel
import com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.viewmodel.EventsFootballWaitinglistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventsFootballWaitinglistActivity :
    BaseActivity<ActivityEventsFootballWaitinglistBinding>(R.layout.activity_events_football_waitinglist)
    {
  private val viewModel: EventsFootballWaitinglistVM by viewModels<EventsFootballWaitinglistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseOneAdapter =
    ListellipseOneAdapter(viewModel.listellipseOneList.value?:mutableListOf())
    binding.recyclerListellipseOne.adapter = listellipseOneAdapter
    listellipseOneAdapter.setOnItemClickListener(
    object : ListellipseOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseOne1RowModel) {
        onClickRecyclerListellipseOne(view, position, item)
      }
    }
    )
    viewModel.listellipseOneList.observe(this) {
      listellipseOneAdapter.updateData(it)
    }
    binding.eventsFootballWaitinglistVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipseOne(
    view: View,
    position: Int,
    item: ListellipseOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENTS_FOOTBALL_WAITINGLIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventsFootballWaitinglistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
