package com.lordhebx.app.modules.checkinsecurity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityCheckinSecurityBinding
import com.lordhebx.app.modules.checkinsecurity.`data`.model.ListellipseRowModel
import com.lordhebx.app.modules.checkinsecurity.`data`.viewmodel.CheckinSecurityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CheckinSecurityActivity :
    BaseActivity<ActivityCheckinSecurityBinding>(R.layout.activity_checkin_security) {
  private val viewModel: CheckinSecurityVM by viewModels<CheckinSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseRowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    binding.checkinSecurityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: ListellipseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHECKIN_SECURITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckinSecurityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
