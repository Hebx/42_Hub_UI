package com.lordhebx.app.modules.menustaff.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListhackathon1Binding
import com.lordhebx.app.modules.menustaff.`data`.model.Listhackathon1RowModel
import kotlin.Int
import kotlin.collections.List

class ListhackathonAdapter(
  var list: List<Listhackathon1RowModel>
) : RecyclerView.Adapter<ListhackathonAdapter.RowListhackathon1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListhackathon1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listhackathon1,parent,false)
    return RowListhackathon1VH(view)
  }

  override fun onBindViewHolder(holder: RowListhackathon1VH, position: Int) {
    val listhackathon1RowModel = Listhackathon1RowModel()
    // TODO uncomment following line after integration with data source
    // val listhackathon1RowModel = list[position]
    holder.binding.listhackathon1RowModel = listhackathon1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listhackathon1RowModel>) {
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
      item: Listhackathon1RowModel
    ) {
    }
  }

  inner class RowListhackathon1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListhackathon1Binding = RowListhackathon1Binding.bind(itemView)
  }
}
