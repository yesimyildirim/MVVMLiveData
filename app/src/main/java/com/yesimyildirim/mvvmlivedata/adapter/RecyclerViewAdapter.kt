package com.yesimyildirim.mvvmlivedata.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yesimyildirim.mvvmlivedata.R
import com.yesimyildirim.mvvmlivedata.model.ModelData

import kotlinx.android.synthetic.main.item_recyclerview.view.*

class RecyclerViewAdapter(val dataList: ArrayList<ModelData>): RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder> (){
    class DataViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_recyclerview,parent,false)
        return DataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.view.kod.text = dataList[position].login
        holder.view.ad.text=dataList[position].id.toString()

    }
    fun updateDataList(newDataList: List<ModelData>) {
        dataList.clear()
        dataList.addAll(newDataList)
        notifyDataSetChanged()
    }

}
