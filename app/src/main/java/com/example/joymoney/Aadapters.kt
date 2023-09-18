package com.example.joymoney

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Aadapters(private val myContext: Context, fm: FragmentManager, var totalTabs: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return SalariedFragment()
            }
            1 -> {
                return SelfEmployedFragment()
            }
            else -> return Fragment()
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}