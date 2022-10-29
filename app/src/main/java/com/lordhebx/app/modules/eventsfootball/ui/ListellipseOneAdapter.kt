package com.lordhebx.app.modules.eventsfootball.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListellipseOneBinding
import com.lordhebx.app.modules.eventsfootball.`data`.model.ListellipseOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseOneAdapter(
  var list: List<ListellipseOneRowModel>
) : RecyclerView.Adapter<ListellipseOneAdapter.RowListellipseOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipse_one,parent,false)
    return RowListellipseOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseOneVH, position: Int) {
    val listellipseOneRowModel = ListellipseOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseOneRowModel = list[position]
    holder.binding.listellipseOneRowModel = listellipseOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseOneRowModel>) {
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
      item: ListellipseOneRowModel
    ) {
    }
  }

  inner class RowListellipseOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseOneBinding = RowListellipseOneBinding.bind(itemView)
  }
}
