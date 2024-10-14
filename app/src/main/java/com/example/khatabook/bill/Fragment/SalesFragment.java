package com.example.khatabook.bill.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khatabook.bill.Activity.AddBillTransActivity;
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

        binding.addBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddBillTransActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}