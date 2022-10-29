package com.lordhebx.app.modules.homestudent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowListhackathon2Binding
import com.lordhebx.app.modules.homestudent.`data`.model.Listhackathon2RowModel
import kotlin.Int
import kotlin.collections.List

class ListhackathonAdapter(
  var list: List<Listhackathon2RowModel>
) : RecyclerView.Adapter<ListhackathonAdapter.RowListhackathon2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListhackathon2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listhackathon2,parent,false)
    return RowListhackathon2VH(view)
  }

  override fun onBindViewHolder(holder: RowListhackathon2VH, position: Int) {
    val listhackathon2RowModel = Listhackathon2RowModel()
    // TODO uncomment following line after integration with data source
    // val listhackathon2RowModel = list[position]
    holder.binding.listhackathon2RowModel = listhackathon2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listhackathon2RowModel>) {
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
      item: Listhackathon2RowModel
    ) {
    }
  }

  inner class RowListhackathon2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListhackathon2Binding = RowListhackathon2Binding.bind(itemView)
  }
}
