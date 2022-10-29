package com.lordhebx.app.modules.menustaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListicecreamdayBinding
import com.lordhebx.app.modules.menustaff.`data`.model.ListicecreamdayRowModel
import kotlin.Int
import kotlin.collections.List

class ListicecreamdayAdapter(
  var list: List<ListicecreamdayRowModel>
) : RecyclerView.Adapter<ListicecreamdayAdapter.RowListicecreamdayVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListicecreamdayVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listicecreamday,parent,false)
    return RowListicecreamdayVH(view)
  }

  override fun onBindViewHolder(holder: RowListicecreamdayVH, position: Int) {
    val listicecreamdayRowModel = ListicecreamdayRowModel()
    // TODO uncomment following line after integration with data source
    // val listicecreamdayRowModel = list[position]
    holder.binding.listicecreamdayRowModel = listicecreamdayRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListicecreamdayRowModel>) {
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
      item: ListicecreamdayRowModel
    ) {
    }
  }

  inner class RowListicecreamdayVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListicecreamdayBinding = RowListicecreamdayBinding.bind(itemView)
  }
}
