package com.lordhebx.app.modules.homestaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListhackathonBinding
import com.lordhebx.app.modules.homestaff.`data`.model.ListhackathonRowModel
import kotlin.Int
import kotlin.collections.List

class ListhackathonAdapter(
  var list: List<ListhackathonRowModel>
) : RecyclerView.Adapter<ListhackathonAdapter.RowListhackathonVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListhackathonVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listhackathon,parent,false)
    return RowListhackathonVH(view)
  }

  override fun onBindViewHolder(holder: RowListhackathonVH, position: Int) {
    val listhackathonRowModel = ListhackathonRowModel()
    // TODO uncomment following line after integration with data source
    // val listhackathonRowModel = list[position]
    holder.binding.listhackathonRowModel = listhackathonRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListhackathonRowModel>) {
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
      item: ListhackathonRowModel
    ) {
    }
  }

  inner class RowListhackathonVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListhackathonBinding = RowListhackathonBinding.bind(itemView)
  }
}
