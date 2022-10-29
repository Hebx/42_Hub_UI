package com.lordhebx.app.modules.onboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityOnboardBinding
import com.lordhebx.app.modules.dashboard.ui.DashboardActivity
import com.lordhebx.app.modules.onboard.`data`.viewmodel.OnboardVM
import kotlin.String
import kotlin.Unit

class OnboardActivity : BaseActivity<ActivityOnboardBinding>(R.layout.activity_onboard) {
  private val viewModel: OnboardVM by viewModels<OnboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 10000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "ONBOARD_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, OnboardActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
