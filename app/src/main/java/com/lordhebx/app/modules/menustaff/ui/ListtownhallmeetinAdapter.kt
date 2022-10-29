package com.lordhebx.app.modules.menustaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListtownhallmeetinBinding
import com.lordhebx.app.modules.menustaff.`data`.model.ListtownhallmeetinRowModel
import kotlin.Int
import kotlin.collections.List

class ListtownhallmeetinAdapter(
  var list: List<ListtownhallmeetinRowModel>
) : RecyclerView.Adapter<ListtownhallmeetinAdapter.RowListtownhallmeetinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtownhallmeetinVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtownhallmeetin,parent,false)
    return RowListtownhallmeetinVH(view)
  }

  override fun onBindViewHolder(holder: RowListtownhallmeetinVH, position: Int) {
    val listtownhallmeetinRowModel = ListtownhallmeetinRowModel()
    // TODO uncomment following line after integration with data source
    // val listtownhallmeetinRowModel = list[position]
    holder.binding.listtownhallmeetinRowModel = listtownhallmeetinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtownhallmeetinRowModel>) {
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
      item: ListtownhallmeetinRowModel
    ) {
    }
  }

  inner class RowListtownhallmeetinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtownhallmeetinBinding = RowListtownhallmeetinBinding.bind(itemView)
  }
}
