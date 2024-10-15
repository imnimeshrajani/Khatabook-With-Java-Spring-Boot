package com.example.khatabook.parties.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.khatabook.databinding.ActivitySearchOrAddPartyBinding;

public class SearchOrAddPartyActivity extends AppCompatActivity {

    private ActivitySearchOrAddPartyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchOrAddPartyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}