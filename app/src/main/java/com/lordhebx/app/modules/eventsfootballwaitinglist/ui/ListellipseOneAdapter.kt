package com.lordhebx.app.modules.eventsfootballwaitinglist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListellipseOne1Binding
import com.lordhebx.app.modules.eventsfootballwaitinglist.`data`.model.ListellipseOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseOneAdapter(
  var list: List<ListellipseOne1RowModel>
) : RecyclerView.Adapter<ListellipseOneAdapter.RowListellipseOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse_one1,parent,false)
    return RowListellipseOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseOne1VH, position: Int) {
    val listellipseOne1RowModel = ListellipseOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseOne1RowModel = list[position]
    holder.binding.listellipseOne1RowModel = listellipseOne1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseOne1RowModel>) {
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
      item: ListellipseOne1RowModel
    ) {
    }
  }

  inner class RowListellipseOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseOne1Binding = RowListellipseOne1Binding.bind(itemView)
  }
}
