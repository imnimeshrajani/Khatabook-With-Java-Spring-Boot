package com.example.khatabook.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.khatabook.fragment.ExpensesFragment;
import com.example.khatabook.fragment.PurchasesFragment;
import com.example.khatabook.fragment.SalesFragment;

public class BillTransactionAdapter extends FragmentStateAdapter {

    public BillTransactionAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SalesFragment(); // Replace with your actual fragment class
            case 1:
                return new PurchasesFragment(); // Replace with your actual fragment class
            // Add more cases for additional tabs
            case 2:
                return new ExpensesFragment(); // Default to first fragment
            default:
                return new SalesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
