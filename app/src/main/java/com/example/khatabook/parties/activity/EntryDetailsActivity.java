package com.example.khatabook.parties.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.khatabook.databinding.ActivityEntryDetailsBinding;

public class EntryDetailsActivity extends AppCompatActivity {

    private ActivityEntryDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEntryDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}