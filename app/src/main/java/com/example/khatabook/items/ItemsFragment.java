package com.example.khatabook.items;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.khatabook.databinding.FragmentItemsBinding;
import com.example.khatabook.items.adapter.ItemsPagerAdapter;
import com.google.android.material.tabs.TabLayoutMediator;

public class ItemsFragment extends Fragment {
    FragmentItemsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentItemsBinding.inflate(inflater, container, false);

        ItemsPagerAdapter adapter = new ItemsPagerAdapter(getChildFragmentManager(), getLifecycle());
        binding.viewPagerItems.setAdapter(adapter);

        // Link TabLayout and ViewPager2
        new TabLayoutMediator(binding.tabLayoutItems, binding.viewPagerItems,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("PRODUCTS");
                            break;
                        case 1:
                            tab.setText("SERVICES");
                            break;
                    }
                }).attach();
        return binding.getRoot();
    }
}