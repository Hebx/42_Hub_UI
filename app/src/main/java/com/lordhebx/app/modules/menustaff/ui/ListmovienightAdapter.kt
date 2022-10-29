package com.lordhebx.app.modules.menustaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListmovienightBinding
import com.lordhebx.app.modules.menustaff.`data`.model.ListmovienightRowModel
import kotlin.Int
import kotlin.collections.List

class ListmovienightAdapter(
  var list: List<ListmovienightRowModel>
) : RecyclerView.Adapter<ListmovienightAdapter.RowListmovienightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmovienightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmovienight,parent,false)
    return RowListmovienightVH(view)
  }

  override fun onBindViewHolder(holder: RowListmovienightVH, position: Int) {
    val listmovienightRowModel = ListmovienightRowModel()
    // TODO uncomment following line after integration with data source
    // val listmovienightRowModel = list[position]
    holder.binding.listmovienightRowModel = listmovienightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmovienightRowModel>) {
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
      item: ListmovienightRowModel
    ) {
    }
  }

  inner class RowListmovienightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmovienightBinding = RowListmovienightBinding.bind(itemView)
  }
}
