package com.example.chatapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;

import com.example.chatapp.Adapter.MyViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.tabDots)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager2 viewPager;
    protected void onCreaete(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_home);
        init();
        setupViewPager();
    }

    private void setupViewPager() {
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), new Lifecycle() {
            @Override
            public void addObserver(@NonNull @NotNull LifecycleObserver observer) {

            }

            @Override
            public void removeObserver(@NonNull @NotNull LifecycleObserver observer) {

            }

            @NonNull
            @NotNull
            @Override
            public State getCurrentState() {
                return null;
            }
        }));
        new TabLayoutMediator(tabLayout,viewPager,(tab, position) ->{
            if (position == 0)
                tab.setText("Chat");
            else
                tab.setText("People");
        } ).attach();
    }
    private void init(){
        ButterKnife.bind(this);
    }

}
