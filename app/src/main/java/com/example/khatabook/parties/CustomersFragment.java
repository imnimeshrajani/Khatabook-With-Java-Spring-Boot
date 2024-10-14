package com.example.khatabook.parties;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.khatabook.R;
import com.example.khatabook.databinding.FragmentCustomersBinding;
import com.example.khatabook.databinding.FragmentPartiesBinding;

public class CustomersFragment extends Fragment {

    private FragmentCustomersBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCustomersBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }
}