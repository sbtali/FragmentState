package com.alisabet.fragmentstate

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.one -> {
                transaction.replace(R.id.container, OneFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.two -> {
                transaction.replace(R.id.container, TwoFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.three -> {
                transaction.replace(R.id.container, ThreeFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.container, OneFragment.newInstance()).commit()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
