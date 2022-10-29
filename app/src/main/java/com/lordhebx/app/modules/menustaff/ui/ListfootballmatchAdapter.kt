package com.lordhebx.app.modules.menustaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListfootballmatch1Binding
import com.lordhebx.app.modules.menustaff.`data`.model.Listfootballmatch1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfootballmatchAdapter(
  var list: List<Listfootballmatch1RowModel>
) : RecyclerView.Adapter<ListfootballmatchAdapter.RowListfootballmatch1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfootballmatch1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfootballmatch1,parent,false)
    return RowListfootballmatch1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfootballmatch1VH, position: Int) {
    val listfootballmatch1RowModel = Listfootballmatch1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfootballmatch1RowModel = list[position]
    holder.binding.listfootballmatch1RowModel = listfootballmatch1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfootballmatch1RowModel>) {
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
      item: Listfootballmatch1RowModel
    ) {
    }
  }

  inner class RowListfootballmatch1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfootballmatch1Binding = RowListfootballmatch1Binding.bind(itemView)
  }
}
