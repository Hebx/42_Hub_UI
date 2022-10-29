package com.lordhebx.app.modules.appnavigation.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendar: String? = MyApp.getInstance().resources.getString(R.string.lbl_calendar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtONBOARD: String? = MyApp.getInstance().resources.getString(R.string.lbl_onboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckInSecurity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_checkin_securit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckInMenuSecurity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_checkin_menu_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReportSecurity: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_report_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCafeteriaCheckin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cafeteria_check)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCafeteriaMenu: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cafeteria_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCafeteriaChekinForm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cafeteria_cheki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoods: String? = MyApp.getInstance().resources.getString(R.string.lbl_foods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddFoods: String? = MyApp.getInstance().resources.getString(R.string.lbl_addfoods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoodSelectionInformation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_foodselection_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeStaff: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_staff)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenuStaff: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu_staff)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateEventStaff: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_event_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateEventStaffIcnos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_event_st2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeStudent: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_student)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsFootball: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_events_football)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsFootballWaitingList: String? =
      MyApp.getInstance().resources.getString(R.string.msg_events_football)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsMovie: String? = MyApp.getInstance().resources.getString(R.string.lbl_events_movie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsMovieFeedback: String? =
      MyApp.getInstance().resources.getString(R.string.msg_events_movie_fe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEventsMovieFeedbackAdd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_events_movie_fe2)

)
