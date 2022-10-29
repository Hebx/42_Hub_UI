package com.lordhebx.app.modules.foodselectioninformation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityFoodselectionInformationBinding
import com.lordhebx.app.modules.foodselectioninformation.`data`.viewmodel.FoodselectionInformationVM
import kotlin.String
import kotlin.Unit

class FoodselectionInformationActivity :
    BaseActivity<ActivityFoodselectionInformationBinding>(R.layout.activity_foodselection_information)
    {
  private val viewModel: FoodselectionInformationVM by viewModels<FoodselectionInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.foodselectionInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FOODSELECTION_INFORMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FoodselectionInformationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
