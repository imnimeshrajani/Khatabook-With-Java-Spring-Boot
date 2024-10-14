package com.example.khatabook.bill.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khatabook.bill.adapter.BillAdapter;
import com.example.khatabook.databinding.FragmentSalesBinding;

public class SalesFragment extends Fragment {
    FragmentSalesBinding binding;
    private BillAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSalesBinding.inflate(inflater, container, false);


       adapter = new BillAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.billRecycleView.setLayoutManager(layoutManager);
        binding.billRecycleView.setAdapter(adapter);
        return binding.getRoot();
    }
}