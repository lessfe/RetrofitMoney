package com.example.retrofitmoney.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.retrofitmoney.R
import com.example.retrofitmoney.model.nal.NalichkaItem
import android.widget.TextView


class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)
    var listStart = emptyList<NalichkaItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {


        /*val item_buy = holder.itemView.findViewById<View>(R.id.item_buy).toString()
        val item_sale = holder.itemView.findViewById<View>(R.id.item_sale).toString()
        item_name = listStart[position].ccy
        item_buy = listStart[position].ccy
        item_sale = listStart[position].ccy
*/
        holder.itemView.
    }

    override fun getItemCount(): Int {
        return listStart.size
    }
}