package com.example.khatabook.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.khatabook.adapter.PartiesPagerAdapter;
import com.example.khatabook.databinding.FragmentPartiesBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class PartiesFragment extends Fragment {

    private FragmentPartiesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPartiesBinding.inflate(inflater, container, false);

        PartiesPagerAdapter adapter = new PartiesPagerAdapter(getChildFragmentManager(), getLifecycle());
        binding.viewPager.setAdapter(adapter);

        // Link TabLayout and ViewPager2
        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("CUSTOMERS");
                            break;
                        case 1:
                            tab.setText("SUPPLIERS");
                            break;
                    }
                }).attach();
        return binding.getRoot();
    }
}