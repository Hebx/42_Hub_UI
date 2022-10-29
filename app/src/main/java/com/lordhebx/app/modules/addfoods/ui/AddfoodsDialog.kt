package com.lordhebx.app.modules.addfoods.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseDialogFragment
import com.lordhebx.app.databinding.DialogAddfoodsBinding
import com.lordhebx.app.modules.addfoods.`data`.viewmodel.AddfoodsVM
import kotlin.String
import kotlin.Unit

class AddfoodsDialog : BaseDialogFragment<DialogAddfoodsBinding>(R.layout.dialog_addfoods) {
  private val viewModel: AddfoodsVM by viewModels<AddfoodsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.addfoodsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "ADDFOODS_DIALOG"


    fun getInstance(bundle: Bundle?): AddfoodsDialog {
      val fragment = AddfoodsDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
