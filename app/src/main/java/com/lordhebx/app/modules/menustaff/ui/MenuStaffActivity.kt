package com.lordhebx.app.modules.menustaff.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.appcomponents.views.DatePickerFragment
import com.lordhebx.app.databinding.ActivityMenuStaffBinding
import com.lordhebx.app.modules.menustaff.`data`.model.Listfootballmatch1RowModel
import com.lordhebx.app.modules.menustaff.`data`.model.Listhackathon1RowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListicecreamdayRowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListmovienightRowModel
import com.lordhebx.app.modules.menustaff.`data`.model.ListtownhallmeetinRowModel
import com.lordhebx.app.modules.menustaff.`data`.viewmodel.MenuStaffVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuStaffActivity : BaseActivity<ActivityMenuStaffBinding>(R.layout.activity_menu_staff) {
  private val viewModel: MenuStaffVM by viewModels<MenuStaffVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfootballmatchAdapter =
    ListfootballmatchAdapter(viewModel.listfootballmatchList.value?:mutableListOf())
    binding.recyclerListfootballmatch.adapter = listfootballmatchAdapter
    listfootballmatchAdapter.setOnItemClickListener(
    object : ListfootballmatchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfootballmatch1RowModel) {
        onClickRecyclerListfootballmatch(view, position, item)
      }
    }
    )
    viewModel.listfootballmatchList.observe(this) {
      listfootballmatchAdapter.updateData(it)
    }
    val listmovienightAdapter =
    ListmovienightAdapter(viewModel.listmovienightList.value?:mutableListOf())
    binding.recyclerListmovienight.adapter = listmovienightAdapter
    listmovienightAdapter.setOnItemClickListener(
    object : ListmovienightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmovienightRowModel) {
        onClickRecyclerListmovienight(view, position, item)
      }
    }
    )
    viewModel.listmovienightList.observe(this) {
      listmovienightAdapter.updateData(it)
    }
    val listicecreamdayAdapter =
    ListicecreamdayAdapter(viewModel.listicecreamdayList.value?:mutableListOf())
    binding.recyclerListicecreamday.adapter = listicecreamdayAdapter
    listicecreamdayAdapter.setOnItemClickListener(
    object : ListicecreamdayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListicecreamdayRowModel) {
        onClickRecyclerListicecreamday(view, position, item)
      }
    }
    )
    viewModel.listicecreamdayList.observe(this) {
      listicecreamdayAdapter.updateData(it)
    }
    val listtownhallmeetinAdapter =
    ListtownhallmeetinAdapter(viewModel.listtownhallmeetinList.value?:mutableListOf())
    binding.recyclerListtownhallmeetin.adapter = listtownhallmeetinAdapter
    listtownhallmeetinAdapter.setOnItemClickListener(
    object : ListtownhallmeetinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtownhallmeetinRowModel) {
        onClickRecyclerListtownhallmeetin(view, position, item)
      }
    }
    )
    viewModel.listtownhallmeetinList.observe(this) {
      listtownhallmeetinAdapter.updateData(it)
    }
    val listhackathonAdapter =
    ListhackathonAdapter(viewModel.listhackathonList.value?:mutableListOf())
    binding.recyclerListhackathon.adapter = listhackathonAdapter
    listhackathonAdapter.setOnItemClickListener(
    object : ListhackathonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listhackathon1RowModel) {
        onClickRecyclerListhackathon(view, position, item)
      }
    }
    )
    viewModel.listhackathonList.observe(this) {
      listhackathonAdapter.updateData(it)
    }
    binding.menuStaffVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowcalendar.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowcalendar(selectedDate)
      }
    }
    binding.linearRowcalendarOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowcalendarOne(selectedDate)
      }
    }
  }

  fun onClickRecyclerListfootballmatch(
    view: View,
    position: Int,
    item: Listfootballmatch1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmovienight(
    view: View,
    position: Int,
    item: ListmovienightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListicecreamday(
    view: View,
    position: Int,
    item: ListicecreamdayRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtownhallmeetin(
    view: View,
    position: Int,
    item: ListtownhallmeetinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListhackathon(
    view: View,
    position: Int,
    item: Listhackathon1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearRowcalendar(selectedDate: Date) {
  }

  private fun onDateSelectedLinearRowcalendarOne(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "MENU_STAFF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuStaffActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
