package com.example.khatabook.parties;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.khatabook.parties.activity.AddPartyActivity;
import com.example.khatabook.databinding.FragmentSuppliersBinding;

public class SuppliersFragment extends Fragment {

    private FragmentSuppliersBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSuppliersBinding.inflate(inflater, container, false);


        binding.btnAddSupplier.setOnClickListener(view -> {
            Intent intent= new Intent(getActivity(), AddPartyActivity.class);
            intent.putExtra("PARTY_TYPE", "SUPPLIER");
            startActivity(intent);
        });;
        binding.searchBar.setBackground(null);
        return binding.getRoot();
    }
}