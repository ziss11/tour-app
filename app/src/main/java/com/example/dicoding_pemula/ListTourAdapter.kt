package com.example.dicoding_pemula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTourAdapter(private val listTour: ArrayList<Tour>): RecyclerView.Adapter<ListTourAdapter.ListViewHolder>() {
    private lateinit var onItemCLickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemCallback: OnItemClickCallback){
        this.onItemCLickCallback = onItemCallback
    }

    class ListViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView){
        var tvName:TextView = itemView.findViewById(R.id.tv_tour_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_tour_detail)
        var imgTour: ImageView = itemView.findViewById(R.id.img_tour_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_food,viewGroup, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tour = listTour[position]

        Glide.with(holder.itemView.context).load(tour.photo).apply(RequestOptions().override(55,55)).into(holder.imgTour)

        holder.tvName.text = tour.name
        holder.tvDetail.text = tour.detail
        holder.itemView.setOnClickListener{
            onItemCLickCallback.onItemClicked(listTour[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listTour.size
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Tour)
    }
}