package com.example.khatabook.bill.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khatabook.bill.adapter.PurchaseAdapter;
import com.example.khatabook.databinding.FragmentPurchasesBinding;

public class PurchasesFragment extends Fragment {

    FragmentPurchasesBinding binding;
    private PurchaseAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPurchasesBinding.inflate(inflater, container, false);


        adapter = new PurchaseAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.PurchaseRecycleView.setLayoutManager(layoutManager);
        binding.PurchaseRecycleView.setAdapter(adapter);
        return binding.getRoot();
    }
}