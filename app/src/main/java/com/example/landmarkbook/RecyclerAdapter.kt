package com.example.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkbook.databinding.RecyclerRowBinding

class RecyclerAdapter( private val landArray : ArrayList<LandMark>) :RecyclerView.Adapter<RecyclerAdapter.LandmarkVH>() {
    class LandmarkVH(val binding : RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkVH {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return LandmarkVH(binding)
    }

    override fun getItemCount(): Int {
        return landArray.size
    }

    override fun onBindViewHolder(holder: LandmarkVH, position: Int) {
        holder.binding.tvRecyclerView.text = landArray[position].name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context , DetailsActivy::class.java)
            intent.putExtra("landmark",landArray[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}


