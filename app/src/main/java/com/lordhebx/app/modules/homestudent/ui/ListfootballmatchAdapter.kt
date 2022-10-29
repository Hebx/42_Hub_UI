package com.lordhebx.app.modules.homestudent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListfootballmatch2Binding
import com.lordhebx.app.modules.homestudent.`data`.model.Listfootballmatch2RowModel
import kotlin.Int
import kotlin.collections.List

class ListfootballmatchAdapter(
  var list: List<Listfootballmatch2RowModel>
) : RecyclerView.Adapter<ListfootballmatchAdapter.RowListfootballmatch2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfootballmatch2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfootballmatch2,parent,false)
    return RowListfootballmatch2VH(view)
  }

  override fun onBindViewHolder(holder: RowListfootballmatch2VH, position: Int) {
    val listfootballmatch2RowModel = Listfootballmatch2RowModel()
    // TODO uncomment following line after integration with data source
    // val listfootballmatch2RowModel = list[position]
    holder.binding.listfootballmatch2RowModel = listfootballmatch2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfootballmatch2RowModel>) {
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
      item: Listfootballmatch2RowModel
    ) {
    }
  }

  inner class RowListfootballmatch2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfootballmatch2Binding = RowListfootballmatch2Binding.bind(itemView)
  }
}
