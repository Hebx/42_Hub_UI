package com.lordhebx.app.modules.foods.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordhebx.app.R
import com.lordhebx.app.databinding.RowFoodsBinding
import com.lordhebx.app.modules.foods.`data`.model.FoodsRowModel
import kotlin.Int
import kotlin.collections.List

class FoodsAdapter(
  var list: List<FoodsRowModel>
) : RecyclerView.Adapter<FoodsAdapter.RowFoodsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFoodsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_foods,parent,false)
    return RowFoodsVH(view)
  }

  override fun onBindViewHolder(holder: RowFoodsVH, position: Int) {
    val foodsRowModel = FoodsRowModel()
    // TODO uncomment following line after integration with data source
    // val foodsRowModel = list[position]
    holder.binding.foodsRowModel = foodsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FoodsRowModel>) {
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
      item: FoodsRowModel
    ) {
    }
  }

  inner class RowFoodsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFoodsBinding = RowFoodsBinding.bind(itemView)
  }
}
