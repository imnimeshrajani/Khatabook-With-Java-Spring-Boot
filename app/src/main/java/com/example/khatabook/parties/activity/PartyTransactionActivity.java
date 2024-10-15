package com.example.khatabook.parties.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.khatabook.databinding.ActivityPartyTransactionBinding;

public class PartyTransactionActivity extends AppCompatActivity {

    private ActivityPartyTransactionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPartyTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}