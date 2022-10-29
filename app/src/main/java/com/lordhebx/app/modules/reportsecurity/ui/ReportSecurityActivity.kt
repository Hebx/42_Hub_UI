package com.lordhebx.app.modules.reportsecurity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityReportSecurityBinding
import com.lordhebx.app.modules.reportsecurity.`data`.model.Listellipse1RowModel
import com.lordhebx.app.modules.reportsecurity.`data`.viewmodel.ReportSecurityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReportSecurityActivity :
    BaseActivity<ActivityReportSecurityBinding>(R.layout.activity_report_security) {
  private val viewModel: ReportSecurityVM by viewModels<ReportSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse1RowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    binding.reportSecurityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: Listellipse1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REPORT_SECURITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReportSecurityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
