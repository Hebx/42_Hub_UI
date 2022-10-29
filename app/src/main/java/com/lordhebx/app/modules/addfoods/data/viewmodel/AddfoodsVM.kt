package com.lordhebx.app.modules.addfoods.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lordhebx.app.modules.addfoods.`data`.model.AddfoodsModel
import org.koin.core.KoinComponent

class AddfoodsVM : ViewModel(), KoinComponent {
  val addfoodsModel: MutableLiveData<AddfoodsModel> = MutableLiveData(AddfoodsModel())

  var navArguments: Bundle? = null
}
