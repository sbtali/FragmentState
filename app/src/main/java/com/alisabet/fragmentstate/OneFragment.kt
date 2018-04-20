package com.alisabet.fragmentstate

import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class OneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_one, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerone)
        recyclerview.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        val models = ArrayList<Model>()

        models.add(Model("1", "111"))
        models.add(Model("2", "222"))
        models.add(Model("3", "333"))
        models.add(Model("4", "444"))
        models.add(Model("5", "555"))
        models.add(Model("6", "666"))
        models.add(Model("7", "777"))
        models.add(Model("8", "888"))
        models.add(Model("9", "999"))
        models.add(Model("10", "101010"))
        models.add(Model("11", "111111"))
        models.add(Model("12", "121212"))
        models.add(Model("13", "131313"))
        models.add(Model("14", "141414"))
        models.add(Model("15", "151515"))
        models.add(Model("16", "161616"))
        models.add(Model("17", "171717"))
        models.add(Model("18", "181818"))
        models.add(Model("19", "191919"))
        models.add(Model("20", "202020"))
        models.add(Model("21", "212121"))
        models.add(Model("22", "222222"))
        models.add(Model("23", "232323"))
        models.add(Model("24", "242424"))
        models.add(Model("25", "252525"))
        models.add(Model("26", "262626"))
        models.add(Model("27", "272727"))
        models.add(Model("28", "282828"))
        models.add(Model("29", "292929"))
        models.add(Model("30", "303030"))

        var adapter = AdapterOne(models)
        recyclerview.adapter = adapter

        return view
    }

    companion object {
        fun newInstance(): OneFragment = OneFragment()
    }

}