package com.lordhebx.app.modules.homestaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListfootballmatchBinding
import com.lordhebx.app.modules.homestaff.`data`.model.ListfootballmatchRowModel
import kotlin.Int
import kotlin.collections.List

class ListfootballmatchAdapter(
  var list: List<ListfootballmatchRowModel>
) : RecyclerView.Adapter<ListfootballmatchAdapter.RowListfootballmatchVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfootballmatchVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfootballmatch,parent,false)
    return RowListfootballmatchVH(view)
  }

  override fun onBindViewHolder(holder: RowListfootballmatchVH, position: Int) {
    val listfootballmatchRowModel = ListfootballmatchRowModel()
    // TODO uncomment following line after integration with data source
    // val listfootballmatchRowModel = list[position]
    holder.binding.listfootballmatchRowModel = listfootballmatchRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfootballmatchRowModel>) {
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
      item: ListfootballmatchRowModel
    ) {
    }
  }

  inner class RowListfootballmatchVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfootballmatchBinding = RowListfootballmatchBinding.bind(itemView)
  }
}
