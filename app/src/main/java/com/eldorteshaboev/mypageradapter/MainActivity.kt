package com.eldorteshaboev.mypageradapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldorteshaboev.mypageradapter.adapter.MyFragmentStateAdapter
import com.eldorteshaboev.mypageradapter.adapter.RVAdapter
import com.eldorteshaboev.mypageradapter.databinding.ActivityMainBinding
import com.eldorteshaboev.mypageradapter.models.User
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<User>
    lateinit var fragmentStateAdapter: MyFragmentStateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add(User("subtitle1","https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg" ))
        list.add(User("subtitle2","https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg" ))
        list.add(User("subtitle3", "https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg" ))

        fragmentStateAdapter = MyFragmentStateAdapter(this,list)
        binding.myViewPager.adapter = fragmentStateAdapter
        TabLayoutMediator(binding.tabLayout,binding.myViewPager,object:TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                when(position){
                    0->tab.text = "text1"
                    1->tab.text = "text2"
                    2->tab.text = "text3"
                }
            }
        }).attach()
    }
}