package com.lordhebx.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseActivity
import com.lordhebx.app.databinding.ActivityAppNavigationBinding
import com.lordhebx.app.modules.addfoods.ui.AddfoodsDialog
import com.lordhebx.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.lordhebx.app.modules.cafeteriacheckin.ui.CafeteriaCheckinActivity
import com.lordhebx.app.modules.cafeteriachekinform.ui.CafeteriaChekinFormActivity
import com.lordhebx.app.modules.cafeteriamenu.ui.CafeteriaMenuActivity
import com.lordhebx.app.modules.calendar.ui.CalendarActivity
import com.lordhebx.app.modules.checkinmenusecurity.ui.CheckinMenuSecurityActivity
import com.lordhebx.app.modules.checkinsecurity.ui.CheckinSecurityActivity
import com.lordhebx.app.modules.createeventstaff.ui.CreateEventStaffDialog
import com.lordhebx.app.modules.createeventstafficnos.ui.CreateEventStaffIcnosDialog
import com.lordhebx.app.modules.dashboard.ui.DashboardActivity
import com.lordhebx.app.modules.eventsfootball.ui.EventsFootballActivity
import com.lordhebx.app.modules.eventsfootballwaitinglist.ui.EventsFootballWaitinglistActivity
import com.lordhebx.app.modules.eventsmovie.ui.EventsMovieActivity
import com.lordhebx.app.modules.eventsmoviefeedback.ui.EventsMovieFeedbackActivity
import com.lordhebx.app.modules.eventsmoviefeedbackadd.ui.EventsMovieFeedbackAddActivity
import com.lordhebx.app.modules.foods.ui.FoodsActivity
import com.lordhebx.app.modules.foodselectioninformation.ui.FoodselectionInformationActivity
import com.lordhebx.app.modules.homestaff.ui.HomeStaffActivity
import com.lordhebx.app.modules.homestudent.ui.HomeStudentActivity
import com.lordhebx.app.modules.menu.ui.MenuActivity
import com.lordhebx.app.modules.menustaff.ui.MenuStaffActivity
import com.lordhebx.app.modules.onboard.ui.OnboardActivity
import com.lordhebx.app.modules.reportsecurity.ui.ReportSecurityActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearEventsFootballWaitingList.setOnClickListener {
      val destIntent = EventsFootballWaitinglistActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddFoods.setOnClickListener {
      val destFragment = AddfoodsDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, AddfoodsDialog.TAG)
    }
    binding.linearEventsMovieFeedbackAdd.setOnClickListener {
      val destIntent = EventsMovieFeedbackAddActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreateEventStaffIcnos.setOnClickListener {
      val destFragment = CreateEventStaffIcnosDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CreateEventStaffIcnosDialog.TAG)
    }
    binding.linearCafeteriaCheckin.setOnClickListener {
      val destIntent = CafeteriaCheckinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventsFootball.setOnClickListener {
      val destIntent = EventsFootballActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventsMovie.setOnClickListener {
      val destIntent = EventsMovieActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreateEventStaff.setOnClickListener {
      val destFragment = CreateEventStaffDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CreateEventStaffDialog.TAG)
    }
    binding.linearCafeteriaChekinForm.setOnClickListener {
      val destIntent = CafeteriaChekinFormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeStudent.setOnClickListener {
      val destIntent = HomeStudentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearReportSecurity.setOnClickListener {
      val destIntent = ReportSecurityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMenuStaff.setOnClickListener {
      val destIntent = MenuStaffActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCheckInMenuSecurity.setOnClickListener {
      val destIntent = CheckinMenuSecurityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFoodSelectionInformation.setOnClickListener {
      val destIntent = FoodselectionInformationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMenu.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearONBOARD.setOnClickListener {
      val destIntent = OnboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCafeteriaMenu.setOnClickListener {
      val destIntent = CafeteriaMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCalendar.setOnClickListener {
      val destIntent = CalendarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFoods.setOnClickListener {
      val destIntent = FoodsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventsMovieFeedback.setOnClickListener {
      val destIntent = EventsMovieFeedbackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCheckInSecurity.setOnClickListener {
      val destIntent = CheckinSecurityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeStaff.setOnClickListener {
      val destIntent = HomeStaffActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
