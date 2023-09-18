package com.example.joymoney

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class Tablayout : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout)


        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager = findViewById<ViewPager>(R.id.viewPager)



        tabLayout!!.addTab(tabLayout!!.newTab().setText("Salaried"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Self Employed"))

        tabLayout!!.setSelectedTabIndicatorColor(Color.parseColor("#0AA95F"))
        tabLayout!!.setTabTextColors(Color.parseColor("#909090"), Color.parseColor("#0AA95F"));



        val adapter = Aadapters(this, supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

}
