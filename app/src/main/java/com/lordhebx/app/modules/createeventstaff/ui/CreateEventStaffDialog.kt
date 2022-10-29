package com.lordhebx.app.modules.createeventstaff.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseDialogFragment
import com.lordhebx.app.databinding.DialogCreateEventStaffBinding
import com.lordhebx.app.modules.createeventstaff.`data`.viewmodel.CreateEventStaffVM
import kotlin.String
import kotlin.Unit

class CreateEventStaffDialog :
    BaseDialogFragment<DialogCreateEventStaffBinding>(R.layout.dialog_create_event_staff) {
  private val viewModel: CreateEventStaffVM by viewModels<CreateEventStaffVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.createEventStaffVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CREATE_EVENT_STAFF_DIALOG"


    fun getInstance(bundle: Bundle?): CreateEventStaffDialog {
      val fragment = CreateEventStaffDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
