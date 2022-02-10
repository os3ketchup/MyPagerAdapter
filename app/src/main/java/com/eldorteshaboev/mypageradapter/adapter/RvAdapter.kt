package com.eldorteshaboev.mypageradapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldorteshaboev.mypageradapter.databinding.ItemRvBinding
import com.eldorteshaboev.mypageradapter.models.User
import com.squareup.picasso.Picasso

class RVAdapter( val list:List<String>): RecyclerView.Adapter<RVAdapter.VH>() {


    inner class VH(var itemRv: ItemRvBinding):RecyclerView.ViewHolder(itemRv.root){
       fun onBind(imageUrl:String){
            Picasso.get().load(imageUrl).into(itemRv.imageItem)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}