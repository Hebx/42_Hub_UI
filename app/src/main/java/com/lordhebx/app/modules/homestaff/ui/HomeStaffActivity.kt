package com.lordhebx.app.modules.homestaff.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityHomeStaffBinding
import com.lordhebx.app.modules.homestaff.`data`.model.ListfootballmatchRowModel
import com.lordhebx.app.modules.homestaff.`data`.model.ListhackathonRowModel
import com.lordhebx.app.modules.homestaff.`data`.viewmodel.HomeStaffVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeStaffActivity : BaseActivity<ActivityHomeStaffBinding>(R.layout.activity_home_staff) {
  private val viewModel: HomeStaffVM by viewModels<HomeStaffVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfootballmatchAdapter =
    ListfootballmatchAdapter(viewModel.listfootballmatchList.value?:mutableListOf())
    binding.recyclerListfootballmatch.adapter = listfootballmatchAdapter
    listfootballmatchAdapter.setOnItemClickListener(
    object : ListfootballmatchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfootballmatchRowModel) {
        onClickRecyclerListfootballmatch(view, position, item)
      }
    }
    )
    viewModel.listfootballmatchList.observe(this) {
      listfootballmatchAdapter.updateData(it)
    }
    val listhackathonAdapter =
    ListhackathonAdapter(viewModel.listhackathonList.value?:mutableListOf())
    binding.recyclerListhackathon.adapter = listhackathonAdapter
    listhackathonAdapter.setOnItemClickListener(
    object : ListhackathonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListhackathonRowModel) {
        onClickRecyclerListhackathon(view, position, item)
      }
    }
    )
    viewModel.listhackathonList.observe(this) {
      listhackathonAdapter.updateData(it)
    }
    binding.homeStaffVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfootballmatch(
    view: View,
    position: Int,
    item: ListfootballmatchRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListhackathon(
    view: View,
    position: Int,
    item: ListhackathonRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_STAFF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeStaffActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
