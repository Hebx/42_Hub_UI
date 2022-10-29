package com.lordhebx.app.modules.checkinmenusecurity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.appcomponents.views.DatePickerFragment
import com.lordhebx.app.databinding.ActivityCheckinMenuSecurityBinding
import com.lordhebx.app.modules.checkinmenusecurity.`data`.viewmodel.CheckinMenuSecurityVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class CheckinMenuSecurityActivity :
    BaseActivity<ActivityCheckinMenuSecurityBinding>(R.layout.activity_checkin_menu_security) {
  private val viewModel: CheckinMenuSecurityVM by viewModels<CheckinMenuSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.checkinMenuSecurityVM = viewModel
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
    const val TAG: String = "CHECKIN_MENU_SECURITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckinMenuSecurityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
