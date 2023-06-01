package com.example.chatapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.chatapp.Fragments.ChatFragment;
import com.example.chatapp.Fragments.PeopleFragment;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return ChatFragment.getInstance();
        }
        else{
            return PeopleFragment.getInstance();
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
