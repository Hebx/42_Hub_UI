package com.lordhebx.app.modules.cafeteriacheckin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListellipse2Binding
import com.lordhebx.app.modules.cafeteriacheckin.`data`.model.Listellipse2RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseAdapter(
  var list: List<Listellipse2RowModel>
) : RecyclerView.Adapter<ListellipseAdapter.RowListellipse2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse2,parent,false)
    return RowListellipse2VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse2VH, position: Int) {
    val listellipse2RowModel = Listellipse2RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse2RowModel = list[position]
    holder.binding.listellipse2RowModel = listellipse2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse2RowModel>) {
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
      item: Listellipse2RowModel
    ) {
    }
  }

  inner class RowListellipse2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse2Binding = RowListellipse2Binding.bind(itemView)
  }
}
