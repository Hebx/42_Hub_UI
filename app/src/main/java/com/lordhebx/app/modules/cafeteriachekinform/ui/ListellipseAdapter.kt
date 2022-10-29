package com.lordhebx.app.modules.cafeteriachekinform.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListellipse3Binding
import com.lordhebx.app.modules.cafeteriachekinform.`data`.model.Listellipse3RowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseAdapter(
  var list: List<Listellipse3RowModel>
) : RecyclerView.Adapter<ListellipseAdapter.RowListellipse3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipse3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse3,parent,false)
    return RowListellipse3VH(view)
  }

  override fun onBindViewHolder(holder: RowListellipse3VH, position: Int) {
    val listellipse3RowModel = Listellipse3RowModel()
    // TODO uncomment following line after integration with data source
    // val listellipse3RowModel = list[position]
    holder.binding.listellipse3RowModel = listellipse3RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listellipse3RowModel>) {
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
      item: Listellipse3RowModel
    ) {
    }
  }

  inner class RowListellipse3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipse3Binding = RowListellipse3Binding.bind(itemView)
  }
}
