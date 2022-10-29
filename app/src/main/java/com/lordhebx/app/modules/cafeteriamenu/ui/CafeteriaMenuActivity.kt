package com.lordhebx.app.modules.cafeteriamenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.appcomponents.views.DatePickerFragment
import com.lordhebx.app.databinding.ActivityCafeteriaMenuBinding
import com.lordhebx.app.modules.cafeteriamenu.`data`.viewmodel.CafeteriaMenuVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class CafeteriaMenuActivity :
    BaseActivity<ActivityCafeteriaMenuBinding>(R.layout.activity_cafeteria_menu) {
  private val viewModel: CafeteriaMenuVM by viewModels<CafeteriaMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cafeteriaMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowcalendar.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowcalendar(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearRowcalendar(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "CAFETERIA_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CafeteriaMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
