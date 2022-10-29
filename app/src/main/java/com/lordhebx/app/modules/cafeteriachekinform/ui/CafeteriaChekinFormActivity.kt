package com.lordhebx.app.modules.cafeteriachekinform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityCafeteriaChekinFormBinding
import com.lordhebx.app.modules.cafeteriachekinform.`data`.model.Listellipse3RowModel
import com.lordhebx.app.modules.cafeteriachekinform.`data`.viewmodel.CafeteriaChekinFormVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CafeteriaChekinFormActivity :
    BaseActivity<ActivityCafeteriaChekinFormBinding>(R.layout.activity_cafeteria_chekin_form) {
  private val viewModel: CafeteriaChekinFormVM by viewModels<CafeteriaChekinFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipse3RowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    binding.cafeteriaChekinFormVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: Listellipse3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CAFETERIA_CHEKIN_FORM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CafeteriaChekinFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
