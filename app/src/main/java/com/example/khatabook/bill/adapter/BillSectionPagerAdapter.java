package com.example.khatabook.bill.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.khatabook.bill.Fragment.ExpensesFragment;
import com.example.khatabook.bill.Fragment.PurchasesFragment;
import com.example.khatabook.bill.Fragment.SalesFragment;


public class BillSectionPagerAdapter extends FragmentStateAdapter {
    public BillSectionPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SalesFragment();
            case 1:
                return new PurchasesFragment();
            case 2:
                return new ExpensesFragment();
            default:
                return new SalesFragment(); // Default fragment
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Total number of fragments
    }
}
