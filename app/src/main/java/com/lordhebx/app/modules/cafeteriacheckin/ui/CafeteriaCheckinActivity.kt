package com.lordhebx.app.modules.cafeteriacheckin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityCafeteriaCheckinBinding
import com.lordhebx.app.modules.cafeteriacheckin.`data`.model.Listellipse2RowModel
import com.lordhebx.app.modules.cafeteriacheckin.`data`.viewmodel.CafeteriaCheckinVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CafeteriaCheckinActivity :
    BaseActivity<ActivityCafeteriaCheckinBinding>(R.layout.activity_cafeteria_checkin) {
  private val viewModel: CafeteriaCheckinVM by viewModels<CafeteriaCheckinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse2RowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    binding.cafeteriaCheckinVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: Listellipse2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CAFETERIA_CHECKIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CafeteriaCheckinActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
