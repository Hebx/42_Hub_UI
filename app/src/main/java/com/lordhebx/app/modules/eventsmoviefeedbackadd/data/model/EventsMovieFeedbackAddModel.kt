package com.lordhebx.app.modules.eventsmoviefeedbackadd.`data`.model

import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.di.MyApp
import kotlin.String

data class EventsMovieFeedbackAddModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_my_highly_inte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustheretose: String? =
      MyApp.getInstance().resources.getString(R.string.msg_just_here_to_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowdoIuseth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_do_i_use_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_food_tasted_rea)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMovieNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_movie_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveHundredTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_movie_night_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_food_tasted_rea)

)
