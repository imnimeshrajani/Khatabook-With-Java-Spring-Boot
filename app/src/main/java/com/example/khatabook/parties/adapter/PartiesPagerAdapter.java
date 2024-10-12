package com.example.khatabook.parties.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.khatabook.parties.CustomersFragment;
import com.example.khatabook.parties.SuppliersFragment;

public class PartiesPagerAdapter extends FragmentStateAdapter {
    public PartiesPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CustomersFragment();
            case 1:
                return new SuppliersFragment();
            default:
                return new CustomersFragment(); // Default fragment
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Total number of fragments
    }
}
