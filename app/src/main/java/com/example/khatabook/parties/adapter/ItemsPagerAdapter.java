package com.example.khatabook.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.khatabook.fragment.CustomersFragment;
import com.example.khatabook.fragment.ProductFragment;
import com.example.khatabook.fragment.ServiceFragment;
import com.example.khatabook.fragment.SuppliersFragment;

public class ItemsPagerAdapter extends FragmentStateAdapter {
    public ItemsPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ProductFragment();
            case 1:
                return new ServiceFragment();
            default:
                return new ProductFragment(); // Default fragment
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Total number of fragments
    }
}
