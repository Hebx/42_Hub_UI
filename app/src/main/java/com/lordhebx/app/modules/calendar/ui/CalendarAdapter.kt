package com.lordhebx.app.modules.calendar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowCalendarBinding
import com.lordhebx.app.modules.calendar.`data`.model.CalendarRowModel
import kotlin.Int
import kotlin.collections.List

class CalendarAdapter(
  var list: List<CalendarRowModel>
) : RecyclerView.Adapter<CalendarAdapter.RowCalendarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCalendarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_calendar,parent,false)
    return RowCalendarVH(view)
  }

  override fun onBindViewHolder(holder: RowCalendarVH, position: Int) {
    val calendarRowModel = CalendarRowModel()
    // TODO uncomment following line after integration with data source
    // val calendarRowModel = list[position]
    holder.binding.calendarRowModel = calendarRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CalendarRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CalendarRowModel
    ) {
    }
  }

  inner class RowCalendarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCalendarBinding = RowCalendarBinding.bind(itemView)
  }
}
