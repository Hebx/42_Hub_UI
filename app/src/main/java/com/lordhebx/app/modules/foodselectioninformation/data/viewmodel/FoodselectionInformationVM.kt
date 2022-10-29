package com.lordhebx.app.modules.foodselectioninformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.foodselectioninformation.`data`.model.FoodselectionInformationModel
import org.koin.core.KoinComponent

class FoodselectionInformationVM : ViewModel(), KoinComponent {
  val foodselectionInformationModel: MutableLiveData<FoodselectionInformationModel> =
      MutableLiveData(FoodselectionInformationModel())

  var navArguments: Bundle? = null
}
