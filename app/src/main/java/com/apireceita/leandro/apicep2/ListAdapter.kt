package com.apireceita.leandro.apicep2

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListAdapter(val context: Context, val list: ArrayList<President>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.row_layout, parent, false)

        val presidentId = view.findViewById<AppCompatTextView>(R.id.president_id)
        val presidentName = view.findViewById<AppCompatTextView>(R.id.president_name)
        val presidentPolitic = view.findViewById<AppCompatTextView>(R.id.president_politic)
        val presidentTime = view.findViewById<AppCompatTextView>(R.id.president_time)

        presidentId.text = list[position].id.toString()
        presidentName.text = list[position].name.toString()
        presidentPolitic.text = list[position].politic.toString()
        presidentTime.text = list[position].time.toString()

        return view

    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}