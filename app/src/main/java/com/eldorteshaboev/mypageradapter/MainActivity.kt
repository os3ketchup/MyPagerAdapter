package com.eldorteshaboev.mypageradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eldorteshaboev.mypageradapter.adapter.MyFragmentPageAdapter
import com.eldorteshaboev.mypageradapter.databinding.ActivityMainBinding
import com.eldorteshaboev.mypageradapter.models.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<User>
    lateinit var myFragmentPageAdapter: MyFragmentPageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add(User(imageLink = "https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg", name = "Test1"))
        list.add(User(imageLink = "https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg", name = "Test2"))
        list.add(User(imageLink = "https://storage.kun.uz/source/thumbnails/_medium/8/XaRTF01ZC8vWszd5grBqrE9H74JjTIGn_medium.jpg", name = "Test3"))

            myFragmentPageAdapter = MyFragmentPageAdapter(list,supportFragmentManager)
            binding.myViewPager.adapter = myFragmentPageAdapter

            binding.tabLayout.setupWithViewPager(binding.myViewPager)

    }
}