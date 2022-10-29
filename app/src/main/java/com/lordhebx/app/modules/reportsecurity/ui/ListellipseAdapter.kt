package com.lordhebx.app.modules.reportsecurity.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListellipse1Binding
import com.lordhebx.app.modules.reportsecurity.`data`.model.Listellipse1RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseAdapter(
  var list: List<Listellipse1RowModel>
) : RecyclerView.Adapter<ListellipseAdapter.RowListellipse1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse1,parent,false)
    return RowListellipse1VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse1VH, position: Int) {
    val listellipse1RowModel = Listellipse1RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse1RowModel = list[position]
    holder.binding.listellipse1RowModel = listellipse1RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse1RowModel>) {
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
      item: Listellipse1RowModel
    ) {
    }
  }

  inner class RowListellipse1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse1Binding = RowListellipse1Binding.bind(itemView)
  }
}
