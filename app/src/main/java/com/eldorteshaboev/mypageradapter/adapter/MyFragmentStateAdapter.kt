package com.eldorteshaboev.mypageradapter.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.eldorteshaboev.mypageradapter.ItemFragment
import com.eldorteshaboev.mypageradapter.models.User

class MyFragmentStateAdapter(fragmentActivity: FragmentActivity,val list: List<User>):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return ItemFragment.newInstance(list[position].name,list[position].imageLink)
    }
}