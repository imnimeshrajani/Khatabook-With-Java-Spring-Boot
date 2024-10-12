package com.example.khatabook.bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khatabook.R;
import com.example.khatabook.bill.adapter.ExpanseAdapter;
import com.example.khatabook.bill.adapter.PurchaseAdapter;
import com.example.khatabook.databinding.FragmentExpensesBinding;
import com.example.khatabook.databinding.FragmentPurchasesBinding;

public class ExpensesFragment extends Fragment {

    FragmentExpensesBinding binding;
    ExpanseAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentExpensesBinding.inflate(inflater, container, false);
        adapter = new ExpanseAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.PurchaseRecycleView.setLayoutManager(layoutManager);
        binding.PurchaseRecycleView.setAdapter(adapter);
        return binding.getRoot();
    }
}