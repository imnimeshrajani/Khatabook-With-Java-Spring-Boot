package com.example.khatabook.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.khatabook.fragment.BillFragment;
import com.example.khatabook.fragment.CustomersFragment;
import com.example.khatabook.fragment.ItemsFragment;
import com.example.khatabook.fragment.MoreFragment;
import com.example.khatabook.fragment.PartiesFragment;
import com.example.khatabook.fragment.SuppliersFragment;

public class SectionsPagerAdapter extends FragmentStateAdapter {
    public SectionsPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
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
