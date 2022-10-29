package com.lordhebx.app.modules.createeventstafficnos.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.lordhebx.app.R
import com.lordhebx.app.appcomponents.base.BaseDialogFragment
import com.lordhebx.app.databinding.DialogCreateEventStaffIcnosBinding
import com.lordhebx.app.modules.createeventstafficnos.`data`.viewmodel.CreateEventStaffIcnosVM
import kotlin.String
import kotlin.Unit

class CreateEventStaffIcnosDialog :
    BaseDialogFragment<DialogCreateEventStaffIcnosBinding>(R.layout.dialog_create_event_staff_icnos)
    {
  private val viewModel: CreateEventStaffIcnosVM by viewModels<CreateEventStaffIcnosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.createEventStaffIcnosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CREATE_EVENT_STAFF_ICNOS_DIALOG"


    fun getInstance(bundle: Bundle?): CreateEventStaffIcnosDialog {
      val fragment = CreateEventStaffIcnosDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
