package com.alisabet.fragmentstate

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AdapterOne(private val dataSet: ArrayList<Model>) : RecyclerView.Adapter<AdapterOne.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var txtName : TextView
        var txtTitle : TextView
        init {
            v.setOnClickListener { Log.d(tag, "Element $adapterPosition clicked.") }
            txtName = v.findViewById(R.id.txtName)
            txtTitle = v.findViewById(R.id.txtTitle)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.rowone, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d(tag, "Element $position set.")
        viewHolder.txtName.text = dataSet[position].name
        viewHolder.txtTitle.text = dataSet[position].title
    }

    override fun getItemCount() = dataSet.size

    companion object {
        private val tag = "CustomAdapter"
    }
}