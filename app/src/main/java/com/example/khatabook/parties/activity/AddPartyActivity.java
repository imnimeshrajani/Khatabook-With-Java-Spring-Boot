package com.example.khatabook.parties.activity;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.khatabook.R;
import com.example.khatabook.databinding.ActivityAddPartyBinding;

public class AddPartyActivity extends AppCompatActivity {
    private ActivityAddPartyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddPartyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String partyType = getIntent().getStringExtra("PARTY_TYPE");
        if (partyType.equals("CUSTOMER")) {
            binding.rbCustomer.setChecked(true);
            binding.btnAddParty.setText(getString(R.string.add_customer));
            binding.btnAddParty.setTextColor(Color.BLACK);
            binding.btnAddParty.setBackgroundColor(getColor(R.color.light_blue));
        } else {
            binding.rbSupplier.setChecked(true);
            binding.btnAddParty.setText(getString(R.string.add_supplier));
            binding.btnAddParty.setTextColor(Color.WHITE);
            binding.btnAddParty.setBackgroundColor(getColor(R.color.purple_500));

        }
        binding.rgPartType.setOnCheckedChangeListener((radioGroup, i) -> {
            if(binding.rbCustomer.isChecked()) {
                binding.btnAddParty.setText(getString(R.string.add_customer));
                binding.btnAddParty.setTextColor(Color.BLACK);
                binding.btnAddParty.setBackgroundColor(getColor(R.color.light_blue));
            } else {
                binding.btnAddParty.setText(getString(R.string.add_supplier));
                binding.btnAddParty.setTextColor(Color.WHITE);
                binding.btnAddParty.setBackgroundColor(getColor(R.color.purple_500));
            }
        });
    }
}