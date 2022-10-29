package com.lordhebx.app.modules.foods.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityFoodsBinding
import com.lordhebx.app.modules.foods.`data`.model.FoodsRowModel
import com.lordhebx.app.modules.foods.`data`.viewmodel.FoodsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FoodsActivity : BaseActivity<ActivityFoodsBinding>(R.layout.activity_foods) {
  private val viewModel: FoodsVM by viewModels<FoodsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val foodsAdapter = FoodsAdapter(viewModel.foodsList.value?:mutableListOf())
    binding.recyclerFoods.adapter = foodsAdapter
    foodsAdapter.setOnItemClickListener(
    object : FoodsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FoodsRowModel) {
        onClickRecyclerFoods(view, position, item)
      }
    }
    )
    viewModel.foodsList.observe(this) {
      foodsAdapter.updateData(it)
    }
    binding.foodsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFoods(
    view: View,
    position: Int,
    item: FoodsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOODS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FoodsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
