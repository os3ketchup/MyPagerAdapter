package com.eldorteshaboev.mypageradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eldorteshaboev.mypageradapter.adapter.MyPagerAdapter
import com.eldorteshaboev.mypageradapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<String>
    lateinit var myPagerAdapter: MyPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add("https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg")


        myPagerAdapter = MyPagerAdapter(list)
        binding.myViewPager.adapter = myPagerAdapter
    }
}