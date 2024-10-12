package com.example.khatabook.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.khatabook.R;
import com.example.khatabook.adapter.BillSectionPagerAdapter;
import com.example.khatabook.adapter.SectionsPagerAdapter;
import com.example.khatabook.databinding.FragmentBillBinding;
import com.example.khatabook.databinding.FragmentPartiesBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class BillFragment extends Fragment {
    private FragmentBillBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBillBinding.inflate(inflater, container, false);

        BillSectionPagerAdapter adapter = new BillSectionPagerAdapter(getChildFragmentManager(), getLifecycle());
        binding.viewPager.setAdapter(adapter);

        // Link TabLayout and ViewPager2
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("SALE");
                            break;
                        case 1:
                            tab.setText("PURCHASE");
                            break;
                        case 2:
                            tab.setText("EXPANSE");
                            break;
                    }
                }).attach();
        return binding.getRoot();
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}