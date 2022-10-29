package com.lordhebx.app.modules.menu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.appcomponents.views.DatePickerFragment
import com.lordhebx.app.databinding.ActivityMenuBinding
import com.lordhebx.app.modules.menu.`data`.viewmodel.MenuVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class MenuActivity : BaseActivity<ActivityMenuBinding>(R.layout.activity_menu) {
  private val viewModel: MenuVM by viewModels<MenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuVM = viewModel
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
    const val TAG: String = "MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
