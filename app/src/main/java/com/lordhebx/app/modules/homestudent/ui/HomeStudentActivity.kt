package com.lordhebx.app.modules.homestudent.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityHomeStudentBinding
import com.lordhebx.app.modules.homestudent.`data`.model.Listfootballmatch2RowModel
import com.lordhebx.app.modules.homestudent.`data`.model.Listhackathon2RowModel
import com.lordhebx.app.modules.homestudent.`data`.viewmodel.HomeStudentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeStudentActivity : BaseActivity<ActivityHomeStudentBinding>(R.layout.activity_home_student)
    {
  private val viewModel: HomeStudentVM by viewModels<HomeStudentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfootballmatchAdapter =
    ListfootballmatchAdapter(viewModel.listfootballmatchList.value?:mutableListOf())
    binding.recyclerListfootballmatch.adapter = listfootballmatchAdapter
    listfootballmatchAdapter.setOnItemClickListener(
    object : ListfootballmatchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfootballmatch2RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listhackathon2RowModel) {
        onClickRecyclerListhackathon(view, position, item)
      }
    }
    )
    viewModel.listhackathonList.observe(this) {
      listhackathonAdapter.updateData(it)
    }
    binding.homeStudentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfootballmatch(
    view: View,
    position: Int,
    item: Listfootballmatch2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListhackathon(
    view: View,
    position: Int,
    item: Listhackathon2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_STUDENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeStudentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
